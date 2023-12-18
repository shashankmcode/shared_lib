def call() {
    sh """
        docker build -t shashank-java-app .
        docker run -p 8081:8081 shashank-java-app
    """
}
