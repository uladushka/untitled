pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/uladushka/untitled.git'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean install' // или другой инструмент сборки
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Run') {
            steps {
                bat 'java -jar target/your-app.jar' // замените на ваш .jar файл
            }
        }
    }
}
