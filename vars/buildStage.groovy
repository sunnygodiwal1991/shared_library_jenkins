// vars/buildStage.groovy

def call() {
    stage('Build') {
        echo "Building the project..."
        // Add your build logic here (e.g., `mvn clean install`, `npm build`, etc.)
    }
}

