pipeline {
    agent any

    tools {
        maven 'system-maven' 
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build & Test') {
            steps {
                sh 'mvn clean test -U'
            }
            post {
                always {
                    junit 'course-registration-app/target/surefire-reports/TEST-*.xml'
                }
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package -DskipTests'
            }
            post {
                success {
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