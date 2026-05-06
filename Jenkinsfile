pipeline {

    agent any

    tools {
        maven 'Maven3'
        jdk 'JDK21'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/Ankith0505/projectm.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Run Application') {
            steps {
                sh 'mvn exec:java -Dexec.mainClass="com.example.app.App"'
            }
        }
    }

    post {

        always {
            echo 'Pipeline Execution Completed'
        }

        success {
            echo 'Build Successful'

            emailext(
                subject: "SUCCESS: ${JOB_NAME} #${BUILD_NUMBER}",
                body: """
Build succeeded!

Project: ${JOB_NAME}
Build Number: ${BUILD_NUMBER}

Check Console Output:
${BUILD_URL}
""",
                to: "ankithshetty0505@gmail.com"
            )
        }

        failure {
            echo 'Build Failed'

            emailext(
                subject: "FAILED: ${JOB_NAME} #${BUILD_NUMBER}",
                body: """
Build failed!

Project: ${JOB_NAME}
Build Number: ${BUILD_NUMBER}

Check Console Output:
${BUILD_URL}
""",
                to: "ankithshetty0505@gmail.com"
            )
        }
    }
}
