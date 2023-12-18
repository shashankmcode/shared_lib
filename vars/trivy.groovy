def call(){
    sh """
        trivy image shashank-java-app > result.txt
        cat result.txt
    """
}