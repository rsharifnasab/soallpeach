FROM gcc:4.9
RUN mkdir -p /opt/program
WORKDIR /opt/program
COPY a.c /opt/program/
RUN gcc a.c -O3 -Wall -ffast-math
ENTRYPOINT ["./a.out"]

