def call() {
    sh """
        docker build -t shashank-java-app .
    """
}
