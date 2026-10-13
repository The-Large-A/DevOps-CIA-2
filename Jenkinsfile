pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build & Test') {
            steps {
                // Execute Maven from the repository root
                sh 'mvn clean test'
            }
            post {
                always {
                    // Publish JUnit reports from the child module location
                    junit 'course-registration-app/target/surefire-reports/TEST-*.xml'
                }
            }
        }

        stage('Package') {
            steps {
                // Package the application into the jar
                sh 'mvn package -DskipTests'
            }
            post {
                success {
                    // Archive packaged artifact if tests pass
                    archiveArtifacts artifacts: 'course-registration-app/target/*.jar', fingerprint: true
                }
            }
        }
    }

    post {
        failure {
            echo 'Pipeline failed. Packaging and artifact archiving were prevented.'
        }
    }
}
