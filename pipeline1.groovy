node {
    
    stage('Clone sources') {
        git url: 'https://github.com/ceneteng/final.git'
    }

    stage('Run playbook'){

        withEnv(["PATH+ANSIBLE"=${tool 'ansible'}])
        dir('/usr/local/bin') {
        ansiblePlaybook  playbook: 'createTestSecGroups.yml'

        }
    }
}
