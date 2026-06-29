pipeline {
    agent any

    tools {
        maven 'Maven3'
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build Auth Service') {
            steps {
                dir('auth-service') {
                    sh 'mvn clean package -DskipTests'
                }
            }
        }

        stage('Build Loan Service') {
            steps {
                dir('loan-service') {
                    sh 'mvn clean package -DskipTests'
                }
            }
        }

        stage('Build User Service') {
            steps {
                dir('user-service') {
                    sh 'mvn clean package -DskipTests'
                }
            }
        }

        stage('Build API Gateway') {
            steps {
                dir('api-gateway') {
                    sh 'mvn clean package -DskipTests'
                }
            }
        }
    }
}