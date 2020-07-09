# friends-season-finder project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Hands-on (Release mode)
----
### **DataBase**

This project uses a NoSQL-DB. The dataset provided contains some friends episodes and other details.
A docker image was created to provision the data to run this project. To start the DB follow the steps belo:

Download docker image
```$ docker run --network host --name mongo_inf335 -d -t lneves07/mongo-inf335-friends``` 

Execute mongoRestore
```$ docker exec -it mongo_inf335 bash -c "cd /tmp && mongorestore -d friends"``` 

### **Project**

You can download a docker imag to run this project by following the steps below:

```$ docker run -i --rm --network host lneves07/inf335-friends```

### **Test**

If you want to see the project working, follow the link and change the final with the season of your desire.
This will give all episodes of the season.
> http://localhost:8080/season/1

If you want to know about only one episode
> http://localhost:8080/name/EPISODE%20NAME

**Another endpoints:**

http://localhost:8080/friends (Show info about the project)
http://localhost:8080/health (Show project health state)
http://localhost:8080/season/ (Show all episodes of friends)

----

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```
./mvnw quarkus:dev
```

## Packaging and running the application

The application can be packaged using `./mvnw package`.
It produces the `friends-season-finder-1.0-SNAPSHOT-runner.jar` file in the `/target` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/lib` directory.

The application is now runnable using `java -jar target/friends-season-finder-1.0-SNAPSHOT-runner.jar`.

## Creating a native executable

You can create a native executable using: `./mvnw package -Pnative`.

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: `./mvnw package -Pnative -Dquarkus.native.container-build=true`.

You can then execute your native executable with: `./target/friends-season-finder-1.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/building-native-image.