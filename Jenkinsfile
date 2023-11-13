pipeline {
    agent any 
    environment {
        DOCKER_REGISTRY_URL = "https://registry.hub.docker.com/v2/aholman5" // Replace with your Docker registry URL
        DOCKER_REGISTRY_CREDENTIALS = credentials('docker-cred')  // Set this to your Docker registry credentials ID in Jenkins
        DOCKER_IMAGE_NAME = "${DOCKER_REGISTRY_URL}/mypy:latest"
    }
    stages {
        stage("clone") {
          steps {  
            echo "this is a changed message"
          }
        }
        stage("build") {
                  steps {
                    echo "this is  a build stage"
                  }
                }
                stage("deploy") {
                          steps {
                            echo "this is a deploy stage "
                          }
                        }
       
        stage('Build Docker Image') {
            steps {
                script {
                    docker.withRegistry("${DOCKER_REGISTRY_URL}", DOCKER_REGISTRY_CREDENTIALS) {
                         customImage = docker.build(DOCKER_IMAGE_NAME,"./")
                    }
                }
            }
        }
    }
}
