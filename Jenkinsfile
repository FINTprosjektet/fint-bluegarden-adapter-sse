#!groovy

node {
    currentBuild.result = "SUCCESS"

    try {
        stage('checkout') {
            checkout scm
        }

        stage('build') {
            sh './gradlew clean build'
        }

        stage('deploy') {
            sh 'chmod +x docker-build'
            withCredentials([string(credentialsId: 'bluegardenAdapterRunParams', variable: 'runParams')]) {
                // available as an env variable, but will be masked if you try to print it out any which way
                sh 'sudo -E sh ./docker-build'
            }
        }
    }

    catch (err) {
        currentBuild.result = "FAILURE"
        throw err
    }
}