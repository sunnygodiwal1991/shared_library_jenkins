// vars/buildStage.groovy

def call() {
    stage('Build') {
        def mavenVersion = '3.8.1'  // Default version for most jobs
        echo "Building the project..."
        echo "Setting up Maven version: ${mavenVersion}"
        // Add your build logic here (e.g., `mvn clean install`, `npm build`, etc.)
    }
    stage('test') {
        echo "Building the test..."
        // Add your build logic here (e.g., `mvn clean install`, `npm build`, etc.)
    }
}

