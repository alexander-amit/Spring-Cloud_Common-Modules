## Spring-Cloud_Common-Modules
###Implementation of following Common Spring Cloud Modules:
1. Cloud-Config-Server: Externalized configuration of Application 
  - This Server acts as a central server which will pick the configuration of respective application from git repo and send it to the repective application while deploying.
  - With `@RefreshScope` value of compile time variables like any string in any class

2. Eureka-server: This Server will keep track of every MS deployed with all details like port, application-name etc at one place.
Invoke by `localhost:8761/eureka`

3. Cloud-Client/Room-Services - Demo Spring-Boot-Starter Applicaitons to show the registry of Application on Eureka Server.

4. Reservation-business-service - Implementation of Feign Client and RestTemplet.

5. Circuit-Breaker - When One MS depends on another then handle error in case of failure of dependent application.
  - Book_read_App - reads books list from `Book_store`.
  - Book_store - return list of books.
if any error happen while making call to `Book_store` then restController will be redirected to some pre-defined methods. 
