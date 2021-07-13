pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M3"
    }

    stages {
        stage('Build') {
            steps {
                git branch: 'main', url: 'https://github.com/mythsunwind/flakyjunit5test.git'
                sh "mvn clean test"
            }

            post {
                always {
                    junit testDataPublishers: [[$class: 'JUnitFlakyTestDataPublisher']], testResults: 'target/surefire-reports/TEST-*.xml'
                }
            }
        }
    }
}
