pipeline {
    agent any 
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
        stage("scan") {
                          steps {
                            echo "this is a scan stage "
                          }
                        }
    }
}
