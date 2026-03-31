pipeline {
    agent any 
    stages{
        stage('Checkout'){
            steps{
                git 'https://github.com/MrSanketPrajapatissp/java-project-maven-new.git'
            }
        }
        stage('Compile')
        {
            steps{
                sh 'mvn compile'
            }
        }
        stage('Test'){
            steps{
                sh 'mvn test'
            }
        }
        stage('Aritfact'){
            steps{
                sh 'mvn clean package'
            }
        }
        stage('Ansible Playbook'){
            steps{
                echo 'Deployed to Tomcat using playbook'
            }
        }
    }
}
