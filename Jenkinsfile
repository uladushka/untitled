pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                sh 'ant compile'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
                sh 'ant test'
            }
        }
        stage('Run') {
            steps {
                echo 'Running application...'
                sh 'ant run'
            }
        }
    }
}
