package com.university;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegistrationServiceTest {

    private RegistrationService service;
    private Student student;

    @BeforeEach
    void setUp() {
        service = new RegistrationService();
        student = new Student("S101", "Anita");
    }

    @Test
    void shouldRegisterStudentForValidCourse() {
        Course course = new Course("CS301", "Data Structures", 4, 30, true, null);

        boolean result = service.register(student, course);

        assertTrue(result);
        assertTrue(student.isRegistered("CS301"));
        assertEquals(4, student.getTotalCredits());
        assertEquals(1, course.getCurrentEnrollment());
    }

    @Test
    void shouldRejectInactiveCourse() {
        Course course = new Course("CS301", "Data Structures", 4, 30, false, null);

        boolean result = service.register(student, course);

        assertFalse(result);
        assertFalse(student.isRegistered("CS301"));
    }

    @Test
    void shouldRejectMissingPrerequisite() {
        Course course = new Course("CS401", "Advanced Algorithms", 4, 30, true, "CS301");

        boolean result = service.register(student, course);

        assertFalse(result);
        assertFalse(student.isRegistered("CS401"));
    }

    @Test
    void shouldAllowRegistrationWhenPrerequisiteIsCompleted() {
        student.addCompletedPrerequisite("CS301");
        Course course = new Course("CS401", "Advanced Algorithms", 4, 30, true, "CS301");

        boolean result = service.register(student, course);

        assertTrue(result);
        assertTrue(student.isRegistered("CS401"));
    }

    @Test
    void shouldRejectDuplicateRegistration() {
        Course course = new Course("CS301", "Data Structures", 4, 30, true, null);

        assertTrue(service.register(student, course));

        boolean secondAttempt = service.register(student, course);

        assertFalse(secondAttempt);
        assertEquals(4, student.getTotalCredits());
        assertEquals(1, course.getCurrentEnrollment());
    }

    @Test
    void shouldRejectRegistrationWhenCreditLimitIsExceeded() {
        // Updated for Question Set A (Max Credits = 24):
        // Simulate 24 existing credits (e.g., 6 courses * 4 credits)
        student.addRegistration("CS101", 4);
        student.addRegistration("CS102", 4);
        student.addRegistration("CS201", 4);
        student.addRegistration("CS202", 4);
        student.addRegistration("CS203", 4);
        student.addRegistration("CS204", 4); // Total = 24 credits

        Course course = new Course("CS301", "Data Structures", 4, 30, true, null);

        boolean result = service.register(student, course);

        assertFalse(result, "Registration exceeding 24 credits must be rejected.");
        assertFalse(student.isRegistered("CS301"));
        assertEquals(24, student.getTotalCredits());
    }

    @Test
    void testRegisterAtExactCreditLimit24() {
        // Register 6 courses * 4 credits = exactly 24 credits
        Course c1 = new Course("C1", "Course 1", 4, 10, true, null);
        Course c2 = new Course("C2", "Course 2", 4, 10, true, null);
        Course c3 = new Course("C3", "Course 3", 4, 10, true, null);
        Course c4 = new Course("C4", "Course 4", 4, 10, true, null);
        Course c5 = new Course("C5", "Course 5", 4, 10, true, null);
        Course c6 = new Course("C6", "Course 6", 4, 10, true, null);

        assertTrue(service.register(student, c1));
        assertTrue(service.register(student, c2));
        assertTrue(service.register(student, c3));
        assertTrue(service.register(student, c4));
        assertTrue(service.register(student, c5));
        
        boolean finalRegistration = service.register(student, c6);

        assertTrue(finalRegistration, "Registration should succeed at exactly 24 total credits.");
        assertEquals(24, student.getTotalCredits());
    }

    @Test
    void testRegisterWhenOneSeatRemaining() {
        Course course = new Course("CS101", "Intro to CS", 4, 1, true, null);
        
        boolean success = service.register(student, course);

        assertTrue(success, "Registration should succeed when exactly one seat remains.");
        assertEquals(1, course.getCurrentEnrollment());
        assertTrue(student.isRegistered("CS101"));
        assertEquals(4, student.getTotalCredits());
    }

    @Test
    void testRegisterWhenCourseAtCapacity() {
        Course course = new Course("CS101", "Intro to CS", 4, 1, true, null);
        course.incrementEnrollment(); // Fill the single seat (1/1)

        Student anotherStudent = new Student("S102", "Bob");
        boolean success = service.register(anotherStudent, course);

        assertFalse(success, "Registration should be rejected when the course is at full capacity.");
        assertEquals(1, course.getCurrentEnrollment());
        assertFalse(anotherStudent.isRegistered("CS101"));
        assertEquals(0, anotherStudent.getTotalCredits());
    }
}