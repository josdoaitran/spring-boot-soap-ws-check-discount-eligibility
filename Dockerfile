FROM openjdk:8
EXPOSE 8080/tcp
VOLUME /tmp
ADD ./target/spring-boot-soap-ws-4.3.3.jar loanDecision.jar
ENTRYPOINT ["java","-jar","/loanDecision.jar"]