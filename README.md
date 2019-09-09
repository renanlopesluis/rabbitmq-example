# rabbitmq-example
A simple Springboot application implementing RabbitMQ for messages consumption and production

This project has aims to give someone a simple notion of Kafka consumer/producer and how to do this on springboot.

**Features**
<br/>
This RabbitMQ implementation was developed by using Java language and Springboot as its framework. Some features are very important to be said, such as:
<br/>
- Clean Code;
- Simplicity;
- Concepts Separation;
- NOSQL database implementation with MongoDB;
- Docker Compose use.
<br/>

**How to use this API**
<br/>
The Api has just a simple POJO named User, and this User has just two attributes such as name and age.
- Using the API for messages production and consumption:
  - Accessing the url _localhost:8080/kafka/produce/{name}/{age} , you should provide a name and an age and then trigger the request which will produce a message, persist the new user and consume it then. 

**Make Sure**
<br/>
- MongoDB should be installed.
- RabbitMq uses Advanced Message Queuing Protocol (AMQP) and usually listens to the port: 5672, you need to put it up to use
RabbitMq, otherwise the springboot application will crash when trying to listen to 5672 during the application run.
So, this project uses Docker Compose to make this work for it and when spring boot application starts nothing is gonna crash,
however make sure that docker compose is installed in your environment.


