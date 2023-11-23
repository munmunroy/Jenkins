pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Check out the source code from the version control system
                checkout scm
                
                // Build the Spring Boot application using Maven
                script {
                    bat 'mvn clean install'
                }
            }
        }

        stage('Test') {
            steps {
                // Run tests using Maven
                script {
                    bat 'mvn test'
                }
            }
        }
    }

    post {
        success {
            // This block will be executed if the build and test stages are successful
            echo 'Build and test succeeded!'
        }

        failure {
            // This block will be executed if either the build or test stage fails
            echo 'Build or test failed. Notify the team.'
        }
    }
}
