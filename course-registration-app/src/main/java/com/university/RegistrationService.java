package com.university;

public class RegistrationService {

    private static final int MAX_CREDITS = 24;

    public boolean register(Student student, Course course) {
        if (student == null || course == null) {
            return false;
        }

        if (!course.isActive()) {
            return false;
        }

        if (course.getCurrentEnrollment() >= course.getCapacity()) {
            return false;
        }

        // Case-insensitive duplicate check across all registered courses
        for (String registeredCode : student.getRegisteredCourses()) {
            if (registeredCode.equalsIgnoreCase(course.getCourseCode())) {
                return false;
            }
        }

        String prerequisite = course.getPrerequisite();
        if (prerequisite != null
                && !prerequisite.isBlank()
                && !student.hasCompletedPrerequisite(prerequisite)) {
            return false;
        }

        if (student.getTotalCredits() + course.getCredits() > MAX_CREDITS) {
            return false;
        }

        student.addRegistration(
                course.getCourseCode(),
                course.getCredits());

        course.incrementEnrollment();

        return true;
    }
}