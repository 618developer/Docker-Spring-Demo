# Docker-Spring-Demo
A simple spring boot api hello world running in docker for Java 1.8

# Run Locally
mvn spring-boot:run

# Endpoint
`localhost:8080/messages`

Will print out hello world in JSON and current timestamp

# Docker
Both Dockerfiles require `mvn package` to be ran first
## Set Up
### Simple Docker
1. `docker build -t <YOUR_IMAGE_NAME_CHOICE> -f Docker/Dockerfile-simple .`
1. `docker run -p 8080:8080 <YOUR_IMAGE_NAME_GOES_HERE>`

### Better Docker
1. `docker build -t <YOUR_IMAGE_NAME_CHOICE> -f Docker/Dockerfile-better .`
