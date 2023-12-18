def call() {
    sh """
        docker build .
        docker run -p 8080:8080 shashank-java-app
    """
}
