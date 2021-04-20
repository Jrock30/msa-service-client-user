# Service Discovery Client Netflix Eureka(Micro Service)
- - -
## 소프트웨어 구성
1. OpenJDK 11
2. Spring Boot 2.4.5
3. Netflix-Eureka-Client
- - -
- Netflix Eureka Client Setting
- - -
Build
 * IDE VM 옵션 Build
> - -Dserver.port=9002
 * Maven Build
> - mvn spring-boot:run -Dspring-boot.run.jvmArguments='-Dserver.port={port}'
> - mvn spring-boot:run (port random)
 * Maven Package After jar Build
> - mvn clean
> - mvn compile package
> - java -jar -Dserver.port={port} ./target/user-service-0.1.jar   // nohub 으로 할 것
