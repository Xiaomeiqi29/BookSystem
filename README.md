## Requirements
JDK 17+

## Architecture
Language: Java  
Architecture: MVC  
Framework: Spring Boot, Spring Data MongoDB  
Database: MongoDB  

## Build & Run
- Start Local Server : ./gradlew bootRun
- Build Jar : ./gradlew clean bootJar

## Build Docker Image & Push To DockerHub
- Build Mongodb Image and push
```
Pull Image : docker pull mongo:latest
Start Image : docker run -d -p 27017:27017 --name bookMongodb mongo:latest
Tag : docker tag mongo:latest meiqixiao855/book:mongodb
Push To DockerHub : docker push meiqixiao855/book:mongodb
```
- Build Book Server Image and push
```
Pull Image : docker pull bookserver
Statr Image : docker run -p 8080:8080 --name bookManagement bookserver
Tag : docker tag bookserver meiqixiao855/book:bookserver
Push To DockerHub : docker push meiqixiao855/book:bookserver
```
## Deploy to AWS
The mongodb database and book service have been deployed to AWS
- Mongodb Database : mongodb://54.206.118.84:27017
- Book Server : http://3.25.76.170:8080




