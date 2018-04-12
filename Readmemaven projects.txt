For maven java unit test

Create a project
mvn archetype:generate -DgroupId=com.hexaware -DartifactId=com.hexaware  -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false


For maven webapp

mvn archetype:generate -DgroupId=hexWebPack 
	-DartifactId=SampleWebApp 
	-DarchetypeArtifactId=maven-archetype-webapp 
	-DinteractiveMode=false

Run test cases
c:\mvn_test\xmlFileEditor>mvn test


Run single test case
The command above runs all test case
mvn -Dtest=TestApp1 test

Skip test
We can skip test by using the following command.
mvn package -Dmaven.test.skip=true


mvn archetype:generate -DgroupId=hexWebPack -DartifactId=SampleWebApp -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false
