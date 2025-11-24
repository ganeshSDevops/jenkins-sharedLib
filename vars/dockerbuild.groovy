def call(String projectName,String imageName,String dockerHubUser){
  echo "Building Docker image: ${dockerHubUser}/${projectName}:${imageName}"
  sh "docker build -t ${dockerHubUser}/${projectName}:${imageName} ."
}
