def call(String projectName,String imageName,String dockerHubUser){
  echo 'this is building code'
  sh 'docker build -t ${dockerHubUser}/${projectName}:${imageName} .'
}
