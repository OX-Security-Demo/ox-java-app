FROM openjdk:8
MAINTAINER Abhisek Datta <abhisek@appsecco.com>

RUN apt-get update
RUN apt-get install -y default-mysql-client
RUN apt-get install -y maven

WORKDIR /app
COPY pom.xml pom.xml

CMD ["tail", "-f", "/dev/null"]
