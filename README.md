# FalabellaTest
## Spring Boot Api

FalabellaTest API on Spring boot.

Rest Full Api for products. 
 
* Get All the products
* Post a new product
* Update a product
* Delete a product by id 
* Find products by sku 

### Start the aplication 
Running on
Java 11 + 

### Add the correct configurations in applicacitons.properties 
This step is necessary

/src/main/resources/application.properties

Modify the following properties to fit your database. 

* url 
* username 
* password

#### Exacute with mvn

Windows example:

    mvnw.cmd spring-boot:run

Unix based:

    mvwn spring-boot:run 

Go to localhost:8080
