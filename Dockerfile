# Image configs
FROM openjdk:15-slim-buster
WORKDIR /app
EXPOSE 4242
ADD out/artifacts/sdp_lab3_jar/sdp_lab3.jar /app/sdp_lab3.jar
CMD ["java", "-cp", "sdp_lab3.jar", "ual.sdp.lab3.ServerProgram"]