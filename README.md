# testst
task for Prior 


docker + jenkins local
установка докера
docker pull jenkins/jenkins
docker run -p 8080:8080 --name=jenkins-master jenkins/jenkins



остановить все docker stop $(docker ps -a -q)