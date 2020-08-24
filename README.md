# Spring-Boot-App-Product-details
Application for updating , deleting , inserting object into the database. We create a list of objects that gets updated in the database.

To run the application run com.Product/ProductApplication.java as Java Application.

Once Server Started open browser go to localhost:8080 to initiate application.
Data through Jsp forms are recieved by the application through several RequestMappings.
ProductController.java Class Handled All the page Requests and their corresponding mappings.
The RESTful API is done by receiving a set of requests and then send appropriate data back to the request.
The API is then compiled into a WAR file using maven, which adds only the dependencies that are used , and ignore the ones that are not specified.
Since we have a MySQL Connection established , we need to provide the service in pivotal dashboard.
This is done by enabling ClearMySQL Database service by giving an appropriate Instance Name.
