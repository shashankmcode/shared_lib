def call(){
    withSonarQubeEnv(credentialsId: 'sonar-api') {
    // some block

    sh 'mvn clean package sonar:sonar'
}
}