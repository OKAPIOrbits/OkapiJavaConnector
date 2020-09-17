# OkapiJavaConnector
Basic routines to init OKAPI services, send service execution requests and get results from the server.

### What you need to build
* Java SDK 11
* Maven
* [org.json](http://www.java2s.com/Code/Jar/j/Downloadjavajsonjar.htm) package (if you do not use maven)
* Supported IDEs: Intellij Idea & Eclipse
  *  Tested with Intellij Idea 2020-02, Eclipse 2019-03 and 2019-06 on Ubuntu 18.04 and macOS 10.14

### The build process using Eclipse
You create a new project within Eclipse and select the directory where the OKAPI files are located. To get rid 
of the JSON errors, you need to include `java-json.jar` by opening the `properies` of your project. Then click 
on `Java BuildPath` and `Add External JAR`. Select the location of the file and apply all changes. Now you are 
set up to use the complete example.

Don't forget to add your username and password in the OkapiConnectorTest.java. You do not have an account yet? 
Do so on [okapiorbits.space/signup](https://okapiorbits.com/signup.html)!

### Create a launch configuration using Eclipse
The OkapiConnectorTest.java contains a runnable part which can be used to create an Eclipse Application configuration. 
Under `Run Configurations` (green run button) choose `Java Application` and choose `New launch configuration`. Type the 
name e.g. `OkapiConnectorTest` and select the `OkapiJavaConnector` in the `Project`section. For the `Main class` input click 
the `search` button. It should find the OkapiConnectorTest.java file. You can select this file. This is it! You can now proceed 
and run the program.

### The build process using Intellij Idea
Open Intellij Idea and select the pom.xml file. Click on the Build Project icon. It should automatically retrieve the org.json 
dependency and build a jar file.

### The build process using Maven on the command line
Run Maven via command line in the directory you cloned:
```shell
mvn clean package
```

### Documentation
For further information on the available end points of the OKAPI API and the documentation visit 
[okapiorbits.space/documentation](https://okapiorbits.space/documentation).
