# Docker-Spring-Demo
A simple spring boot api hello world running in docker.

# Run Locally
mvn spring-boot:run

# Endpoint
`localhost:8080/messages`

Will print out hello world in JSON and current timestamp

# Docker
## Set Up
### Simple Docker
1. 'mvn package'
1. 'docker build -t <YOUR_IMAGE_NAME_CHOICE> -f Docker/Dockerfile-simple .'
