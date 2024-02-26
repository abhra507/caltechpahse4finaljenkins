FROM openjdk:8
EXPOSE 8084
ADD target/Dockerspringbootfinalprojectphase4-0.0.1-SNAPSHOT.war Dockerspringbootfinalprojectphase4-0.0.1-SNAPSHOT.war
ENTRYPOINT [ "java","-jar","/Dockerspringbootfinalprojectphase4-0.0.1-SNAPSHOT.war" ]