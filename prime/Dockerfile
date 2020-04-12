FROM openjdk:8
WORKDIR opt/program
COPY PrimeChecker.java /opt/program/
COPY test.txt /opt/program
RUN javac PrimeChecker.java
ENTRYPOINT ["java","PrimeChecker"]
