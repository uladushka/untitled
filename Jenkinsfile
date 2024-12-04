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
                // Замените на вашу команду сборки
                bat 'echo "Сборка проекта"' // Пример команды
            }
        }
        stage('Test') {
            steps {
                // Замените на вашу команду тестирования
                bat 'echo "Запуск тестов"' // Пример команды
            }
        }
        stage('Run') {
            steps {
                // Замените на вашу команду запуска
                bat 'echo "Запуск приложения"' // Пример команды
            }
        }
    }
}
