# Image configs
FROM alpine:latest
WORKDIR /root/app
ADD /* /root/app

# JDK
RUN openjdk:15-slim-buster
RUN apt update
RUN JAVA_HOME=/usr/local/openjdk-15
ENV PATH=/usr/local/openjdk-15/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin
RUN { echo '#/bin/sh'; echo 'echo "$JAVA_HOME"'; } > /usr/local/bin/docker-java-home && chmod +x /usr/local/bin/docker-java-home && [ "$JAVA_HOME" = "$(docker-java-home)" ]

# COMPILE
RUN javac src/*.java

# RUN RMI REGISTRY
RUN cd out/production/sdp_lab3/ && rmiregistry

# RUN JAVA CLASSES
RUN cd ../../.. && java src/ServerProgram
RUN java src/ClientProgram