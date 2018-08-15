What is REST?
REST stands for REpresentational State Transfer. REST is a web standards based
architecture and uses HTTP Protocol for data communication. It revolves around resources
where every component is a resource and a resource is accessed by a common interface
using HTTP standard methods. 

REST uses various representations to represent a resource like Text, JSON and
XML. JSON is now the most popular format being used in Web Services.
HTTP Methods
The following HTTP methods are most commonly used in a REST based architecture.
? GET - Provides a read only access to a resource.
? PUT - Used to create a new resource.
? DELETE - Used to remove a resource.
? POST - Used to update an existing resource or create a new resource.
? OPTIONS - Used to get the supported operations on a resource.


A web service is a collection of open protocols and standards used for exchanging data
between applications or systems. Software applications written in various programming
languages and running on various platforms can use web services to exchange data over
computer networks like the Internet in a manner similar to inter-process communication
on a single computer. 

 to start your
work with Jersey Framework to create RESTful Web Services.

ensure Path and Java home are set properly
CLASSPATH:
You will find all the Jersey libraries in the directories C:\jaxrs-ri-2.17\jaxrs-ri\lib and
dependencies in C:\jaxrs-ri-2.17\jaxrs-ri\ext. (eg)
Make sure you set your CLASSPATH
variable on this directory properly otherwise you will face problem while running your
application. If you are using Eclipse, then it is not required to set the CLASSPATH because
all the settings will be done through Eclipse.

NOW GO THROUGH THE FIRST EXAMPLE:
Jersey hello world example

THEN READ THE SECOND EXAMPLE
RESTful web services JAXRS json example using jersey - Java2Blog.html
using JSON

http://localhost:8081/JAXRSJsonExample/rest/countries
http://localhost:8081/JAXRSJsonExample/rest/countries/1

Now connect this json with Angular
Create Rest Service with userid, name, email, password,gender
when connecting with angular you will get error

to solve this in the corresponding webservice programs web.xml write the following
<filter>
  <filter-name>CorsFilter</filter-name>
  <filter-class>org.apache.catalina.filters.CorsFilter</filter-class>
</filter>
<filter-mapping>
  <filter-name>CorsFilter</filter-name>
  <url-pattern>/*</url-pattern>
</filter-mapping>

===
then run the angular js program.


=============
Using JDBI connect with backend and modify the program countries to use rest.

It is in myJDBI folder

post is raw data and the content type should be application json in postman for all get post. put not working .
curl is working . go throu readme in jdbi folder

