springboot-blog-rest-api
===================

Spring Boot Blog Application REST API's

## Required Software

* _Java 17_
* _Spring Boot 3.1.1_

## Usage

Create database `myblog`

Create user with `admin role` in mysql
`Roles are automatically created`

```bash
# MySQL Config
spring.datasource.url=jdbc:mysql://localhost:3306/myblog
spring.datasource.username=bestuser
spring.datasource.password=bestuser

#secret javaproject
app.jwt-secret=ce02356f9917223373f26bb97ef5c3e4fafef9cde898bf9cf960e7d08e74ffef
app-jwt-expiration-milliseconds=604800000

spring.profiles.active=dev


```
