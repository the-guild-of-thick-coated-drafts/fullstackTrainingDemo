compiling
javac -d bin -sourcepath . -cp lib/jdbi-2.73.jar;lib/mysql-connector-java-5.1.39.jar JDBIApp.java

Running
java -cp bin;lib/jdbi-2.73.jar;lib/mysql-connector-java-5.1.39.jar  JDBIApp




javac -d bin 
      -sourcepath . 
      -cp lib/jdbi-2.73.jar;lib/mysql-connector-java-5.1.39.jar 
      JDBIApp.java


java -cp bin;lib/jdbi-2.73.jar;
      lib/mysql-connector-java-5.1.39.jar  
      JDBIApp