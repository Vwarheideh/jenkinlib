def call(String stagename) {
    if ("${stagename}" == "build") {
        sh 'mvn clean'
        sh 'mvn package'
    }
    else if ("${stagename}" == "test") {
         sh 'mvn clean'
         sh 'mvn sonar:sonar'
    }
    else if ("${stagename}" == "artifact") {
         sh 'mvn deploy'   
    }
}
