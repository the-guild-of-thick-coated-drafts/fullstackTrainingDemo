public class MyUnit {

    public String concatenate(String one, String two){
        return one + two;
    }
}


mvn archetype:generate -DgroupId=com.hexaware -DartifactId=com.hexaware  -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
