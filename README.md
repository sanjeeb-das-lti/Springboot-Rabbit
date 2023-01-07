Mock project to showcase the Rabbit MQ implementation in Spring Boot

This project showcases Producer & Consumer use case using asynchronous communication in a solo Spring Boot Project.

Technologies used

Spring Boot
Lombok
RabbitMQ
Java 11
Maven
IDE used: IntelliJ

Steps to setup RabbitMQ in Local Windows Machine

Download and install ERlang http://erlang.org/download/otp_win64_22.3.exe
Download and install RabbitMQ https://github.com/rabbitmq/rabbitmq-server/releases/download/v3.8.8/rabbitmq-server-3.8.8.exe
Go to RabbitMQ Server install Directory C:\Program Files\RabbitMQ Server\rabbitmq_server-3.8.3\sbin
Run command > rabbitmq-plugins enable rabbitmq_management
Start the MQ > rabbitmq-service.bat start![image](https://user-images.githubusercontent.com/63063354/211149011-e2e58422-123b-49ea-a060-7442d603fa11.png)
Open browser and enter http://localhost:15672/ to redirect to RabbitMQ Dashboard
Also we can Open it with IP Address http://127.0.0.1:15672
Login page default username and password: guest
After successfully login you should see RabbitMQ Home page!!
