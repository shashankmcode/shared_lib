def call() {
    sh """
        docker build -t shashank-java-app .
        docker run -p 8080:8080 shashank-java-app
    """
}
