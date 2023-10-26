# Football League Manager
The Football League Manager is responsible for controlling all features necessary to manage one league of football.

More description is coming soon....

# How to build and run as a Native Executable?

Required:
- Java 21 LTS: GraalVM CE `(using SDKMAN: 21.0.1-graalce)`
- Maven

### 1. Compile Native Image Using GraalVM
```shell
mvn clean install -Pnative native:compile
```
### 2. Running Native Image Using GraalVM
```shell
target/football-league-manager
```
# How to run with Native Java Image Docker?

Required:
- Java 21 LTS: GraalVM CE `(using SDKMAN: 21.0.1-graalce)`
- Maven
- Docker Desktop

### 1. Build Native Image Container
`This is not working yet...`
```shell
mvn clean -Pnative spring-boot:build-image
```
### 2. Running Native Image Container
```shell
docker run --rm -p 8080:8080 docker.io/library/football-league-manager:0.0.1
```