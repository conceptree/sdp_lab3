# Image configs
FROM openjdk:15-slim-buster
WORKDIR /app
ADD out/artifacts/sdp_lab3_jar/sdp_lab3.jar /app

RUN java -jar /app/sdp_lab3.jar