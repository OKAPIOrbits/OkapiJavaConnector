# OkapiJavaConnector
Basic routines to init OKAPI services, send service execution requests and get results from the server.

### Prerequisites
* Java Development Kit 11
* Maven 3.6.0
* [org.json](http://www.java2s.com/Code/Jar/j/Downloadjavajsonjar.htm) package (if you do not use maven)
* Supported IDEs: Intellij Idea & Eclipse
  *  Tested with Intellij Idea 2020-02, Eclipse 2019-03 and 2019-06 on Ubuntu 18.04, macOS 10.14 and Windows 10

### The build process using Eclipse
You create a new project within Eclipse and select the directory where the OKAPI files are located. To get rid 
of the JSON errors, you need to include `java-json.jar` by opening the `properties` of your project. Then click 
on `Java BuildPath` and `Add External JAR`. Select the location of the file and apply all changes. Now you are 
set up to build the example.

Don't forget to add your username and password in the `OkapiConnectorTest.java`. Get an account at 
[okapiorbits.space/signup](https://okapiorbits.com/signup.html)!

### Create a launch configuration using Eclipse
The OkapiConnectorTest.java contains a runnable part which can be used to create an Eclipse Application configuration. 
Under `Run Configurations` choose `Java Application` and choose `New launch configuration`. Type the 
name e.g. `OkapiConnectorTest` and select the `OkapiJavaConnector` in the `Project`section. For the `Main class` input click 
the `search` button. It should find the OkapiConnectorTest.java file. You can select this file. This is it! You can now proceed 
and run the program.

### The build process using Intellij Idea
Open Intellij Idea and select the pom.xml file. Click on the Build Project icon. It should automatically retrieve the org.json 
dependency and build a jar file. You can also run the example when you have added your username and password in `OkapiConnectorTest.java`.
Click on `Edit Configurations...` then `+` (Add New Configuration) and select `Application`. As Main class: select 
`com.okapiorbits.platform.OkapiConnectorTryout`. JRE should be A valid Java 11 runtime environment. Click `OK`and you can execute the 
`OkapiConnectorTest` by clicking on the `Run` button.

When using the JUnit tests, again click on `Edit Configurations...` then `+` (Add New Configuration) and select `JUnit`. 
Make sure that the test username and password are defined in the `Environment variables`:
```
OKAPI_TEST_USERNAME=<your_username>
OKAPI_TEST_PASSWORD=<your_password>
```

### The build process using Maven on the command line
Define your OKAPI username and password via environment variables:
```shell
export OKAPI_TEST_USERNAME=<your_username>
export OKAPI_TEST_PASSWORD=<your_password>
```
Run Maven via command line in the directory you cloned:
```shell
mvn clean package
```

### Documentation
For further information on the available end points of the OKAPI API and the documentation visit 
[okapiorbits.space/documentation](https://okapiorbits.space/documentation).

