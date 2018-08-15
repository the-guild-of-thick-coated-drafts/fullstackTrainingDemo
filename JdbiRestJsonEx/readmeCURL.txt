
//get

curl -i -H "Accept: application/json" -H "Content-Type: application/json" -X GET http://localhost:8081/JdbiRestJsonEx/rest/countries

curl -X POST  -H "Accept: Application/json" -H "Content-Type: application/json" 
http://localhost:8081/JdbiRestJsonEx/rest/countries -d '{"id":"200","countryName":"Mike"}'




GET:

with JSON:

curl -i -H "Accept: application/json" -H "Content-Type: application/json" -X GET http://hostname/resource
with XML:

curl -H "Accept: application/xml" -H "Content-Type: application/xml" -X GET http://hostname/resource
POST:

For posting data:

curl --data "param1=value1&param2=value2" http://hostname/resource
For file upload:

curl --form "fileupload=@filename.txt" http://hostname/resource
RESTful HTTP Post:

curl -X POST -d @filename http://hostname/resource
For logging into a site (auth):

curl -d "username=admin&password=admin&submit=Login" --dump-header headers http://localhost/Login
curl -L -b headers http://localhost/
Pretty-printing the curl results:

For JSON:

If you use npm and nodejs, you can install json package by running this command:

npm install -g json
Usage:

curl -i -H "Accept: application/json" -H "Content-Type: application/json" -X GET http://hostname/resource | json
If you use pip and python, you can install pjson package by running this command:

pip install pjson
Usage:

curl -i -H "Accept: application/json" -H "Content-Type: application/json" -X GET http://hostname/resource | pjson
If you use Python 2.6+, json tool is bundled within.

Usage:

curl -i -H "Accept: application/json" -H "Content-Type: application/json" -X GET http://hostname/resource | python -m json.tool
If you use gem and ruby, you can install colorful_json package by running this command:

gem install colorful_json
Usage:

curl -i -H "Accept: application/json" -H "Content-Type: application/json" -X GET http://hostname/resource | cjson

