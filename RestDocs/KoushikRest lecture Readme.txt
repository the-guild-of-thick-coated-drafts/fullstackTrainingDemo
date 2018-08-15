WEBPAGE:
Html,
Hypertext- links - show example
HyperTextMarkupLanguage - return html page

HTTP Concept
Resource Locations:  
HttpExchange = returns data
 
ex weather website vs webservice for different country
url
is weatherapp.com/weatherlookup.do?zipcode=1234
Resource based address eg restful api shall be 

weatherapp.com/zipcode/1234

HTTP Methods:
GET  - weatherapp.com/zipcode/1234
POST
PUT -
DELETE
    CRUD ops

SOAP USES ONLY POST whereas REST USES any HTTP Methods

Metadata:
statuscode, responsedata  etc.
every response has statuscode of the webpage or for any request.

200-success
404- URL NOT found
rest sends the code and client will handle based onthe status code

How the server knows which data is sent from the application
eg text, xml, json, html
the Header value contains the meta data about this.
Message headers -  content types
text/xml
application/json
Summary:
Resource based URIs
HTTP methods
Http status codes in response
Message header 
--------------------------------------------------------------
Designing Restful URIs - Api
Web application looks like 

/getMessages.do?id= 10 or /retrieveMessages.action?id=10

explain a typical website with many pages  all urls ends with html - that are unique
let us we have 4 profile static pages then we group and put it in profile folder
so in Rest - Resource based URI
/profiles{profileName} or
/messages/{messageId} or 
/employees/{1000}
so they are Nouns not verbs
/messages/{messageId}/comments/{commentId}

the above URI are Instance resource URI since they have ids in the addresses
if messages or comments (all data is accessed) it is called collection resource URIs

we can filter the URI 
eg /messges ?offset=2091limit= 10
offset is startingpoint and limit the count of messages needed
custom filter
like where condition 
Summary
instance resource uri
collection resource uri
query parameter for pagination and filter results
---------------------

HTTP Methods

get Messages .do ? id= 10

/messages/10  not get or post

post messges.do?id=10
it is still be
/messages/10
even for delete or put or update

GET POST PUT DELETE
HEAD OPTIONS
we use GET/POST REQUEST only instead of naming the uris like that.

IDEMPOTENCE
----------------
what is this put vs post
put is used on update and post to create a record

Get method is read only and repeateable operations
put- post- delete-Other are wrtie methods

no matter how many times get method is called the same output is received.
it is safe to make multile request as there is no harm

let us take delete when multiple calls first time deletes and next time it wont
let us take put similar to delete with the request is repeated again and again

But post is not so.
it creates a message.  if repeated it creates a new message . it is NON Repeatable.

SO - get, put, delete can be repeatable for the same id. - So they are IDEMPOTENT
put not for post. - NON IDEMPOTENT
---------------------------
REST RESPONSE:

Client <---------Response ( XML / JSON )
           -----> Request

Eg in xml and json
show slide 26 in Resful webservice ppt
Rest we are sending or receiving the representations of the Resources.
it can be in xml or json.
How the client knows which format. 
using http protocol - has a concept of request and response. header contains meta data status code, search, message lentgh, date, content type.
This content type specifies the format of the body.

Now explain the Status codes.
to display the error pages - top 10 status codes see the other Readme.txt
4Summary
Resource representation
HTTp headers
Http Status codes.
--------------
HATEOAS - provides a links to resources.
use href for links and using rel can add more details.
Hypermedia As The Engine Of Application State
No Service definition for Rest Api.
egs done listall like
/messages

let us take an example
{
id:1
doj:2018-02-02
name:rrr
}
now to access the id he has to call /messages/{id} 
/messages/1



