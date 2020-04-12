FROM openjdk:8
RUN mkdir -p /opt/program
WORKDIR /opt/program
COPY PrimeChecker.java /opt/program/
RUN javac PrimeChecker.java
ENTRYPOINT ["java","PrimeChecker"]
