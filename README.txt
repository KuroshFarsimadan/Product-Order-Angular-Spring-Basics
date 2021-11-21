////////////////////////////////////////////////////////////
Project initialization
1. Startup: You can use https://start.spring.io/ or do it manually. I usually do it manually and setup the project as I move along, but setting your project up 
with the given https://start.spring.io/ tool will speed up the process and making sure that all of your core POM and dependency configurations are properly
set up. 
2. SQL: We can use all kinds of different database configurations and examples like MySQL using https://bitnami.com/stack/xampp. However, in this example we are using
SQlite. For benefits of SQlite, read more at https://www.sqlite.org/aff_short.html. With our SQL configuration we are going to add Spring data JPA dependency and
convert Product POJO to a JPA entity. Read more at https://docs.oracle.com/javaee/6/tutorial/doc/bnbpz.html and https://en.wikipedia.org/wiki/Jakarta_Persistence. We have
added a JPA Repository interface and customized our JSON payload's for returned Product (POJO) data. 

For SQL I went to https://www.sqlite.org/download.html and installed the command line tools (Precompiled Binaries for Windows). You simply open CMD and go to the folder
where you unarchived your tool and type "sqlite3" or double click on the sqlite3 executable. 



////////////////////////////////////////////////////////////
Example HTTP requests
1. Get
http://localhost:8080/api/v1/products
http://localhost:8080/api/v1/products/1
2. Post
http://localhost:8080/api/v1/products
{
    "name": "Fidget Spinner 2000",
    "description": null,
    "email": "johnymcintosh@nocompany.com",
    "phone": "123-123-123",
    "model": "Johny Mcintosh",
    "serialNumber": null,
    "orderPrice": 1500.0,
    "orderDate": "10-10-2020",
    "hasBeenContacted": true
}

////////////////////////////////////////////////////////////
Angular 
1. ng build --prod for building minified UI files
2. Make sure that the latest built files are in the product-ui dist folder root
3. Run the Spring Boot application on Tomcat and run the Angular application inside the product-ui folder using "ng serve --proxy-config proxy.conf.json" (instead of ng serve) so that Angular app runs with proxy settings
