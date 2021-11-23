# cinema-app
# General info
It's the implementation of a movie ticketing application. The project uses Spring and Hibernate frameworks. The project is built using a SOLID, three-tier architecture (Dao, Service, and Controller levels), and REST principles. Users can choose between two roles: admin or user. The roles have their level of access. 

## The structure of the DB:
![alt tag](https://snipboard.io/6SRjeK.jpg)​ 

## HTTP methods: 
* POST: /register - all
* GET: /cinema-halls - user/admin
* POST: /cinema-halls - admin
* GET: /movies - user/admin
* POST: /movies - admin
* GET: /movie-sessions/available - user/admin
* GET: /movie-sessions/{id} - user/admin
* POST: /movie-sessions - admin
* PUT: /movie-sessions/{id} - admin
* DELETE: /movie-sessions/{id} - admin
* GET: /orders - user/admin
* POST: /orders/complete - user/admin
* PUT: /shopping-carts/movie-sessions - user/admin
* GET: /shopping-carts/by-user - user/user
* GET: /users/by-email - user/admin
  ![line](https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png)
## Technologies
* Java 11
* Spring (Spring Web, Spring Security)
* Hibernate
* MySQL
* Apache Tomcat 9.0.54
* Maven

  ![line](https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png)
## Setup
1. Configure Apache Tomcat 9.0.54 (or higher)
2. Connect your DB to the project
3. In the db.properties file change properties
   ``` java
   #MySQL properties
   db.driver = YOUR DRIVER
   db.url = YOUR DB URL
   db.user = YOUR NAME
   db.password = YOUR PASSWORD
   ```
5. Start the application
6. For login as Admin - use e-mail: admin@gmail.com, password: admin123
7. For login as User - use e-mail: user@gmail.com, password: user123
  ![line](https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png)
