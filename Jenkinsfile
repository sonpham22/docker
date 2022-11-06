pipeline {
    // master executor should be set to 0
    agent any
    stages {
        stage('Build Jar') {
            steps {
                //sh
                sh "mvn clean package -DskipTests"
            }
        }
        stage('Build Image') {
            steps {
                //sh
                sh "docker build -t='sonpham221/test' ."
            }
        }
        stage('Push Image') {
            steps {
			    withCredentials([usernamePassword(credentialsId: 'dockerhub', passwordVariable: 'Asdfgh@221', usernameVariable: 'sonpham221')]) {
                    //sh
			        sh "docker login --username=${user} --password=${pass}"
			        sh "docker push sonpham221/test:latest"
			    }                           
            }
        }
    }
}
