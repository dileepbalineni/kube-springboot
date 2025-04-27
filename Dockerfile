FROM amazoncorretto:17-alpine3.19
RUN apk --no-cache add curl
VOLUME /tmp
EXPOSE 8882
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} server.jar
ENTRYPOINT ["java","-jar","/server.jar"]
