pipelineJob('armond-devops-challange-via-seed') {
    displayName('seed-armond-DC')
    description('Build pipeline for single branch.')
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/Armond107rah/DevOpschallenge.git')
                        credentials('9f423e1c-8bf5-42f2-b8d4-60710c311215')
                    }
                    branch('production')
                }
            }
            scriptPath('Jenkinsfile')
        }
    }

    logRotator {
        daysToKeep(3)
        numToKeep(1)
    }
    properties {
        disableConcurrentBuilds()
    }
}
multibranchPipelineJob('armonds_MB_via-seed') {
    displayName('armonds_MB_via-seed')
    description('Jenkins pipeline to armonds_MB_via-seed')
    branchSources {
        github {
            id('759275285')
            repoOwner('Armond107rah')
            repository('DevOpschallenge.git')
            scanCredentialsId('9f423e1c-8bf5-42f2-b8d4-60710c311215')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            daysToKeep(3)
            numToKeep(1)
        }
    }
    factory {
        workflowBranchProjectFactory {
            scriptPath('Jenkinsfile')
        }
    }
}