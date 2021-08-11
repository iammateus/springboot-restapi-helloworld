FROM adoptopenjdk/maven-openjdk11

WORKDIR /app
COPY . .

ENTRYPOINT [ "mvn" ]
CMD [ "spring-boot:run" ]