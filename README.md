# OkapiJavaConnector
Basic routines to init OKAPI services, send service execution requests and get results from the server.

### What you need to build
* Java SDK
* [org.json](http://www.java2s.com/Code/Jar/j/Downloadjavajsonjar.htm) package 
* Recommended IDE: Eclipse
  *  Tested with Eclipse 2019-03 and 2019-06 on Ubuntu 18.04 and macOS 10.14

### The build process
This is a first exmaple for sending a request to the OKAPI server and retrieving the results. 
It is set up under Eclipse 2019-03 and Ubuntu 18.04. You create a new project within Eclipse and 
select the directory where the OKAPI files are located. To get rid of the JSON errors, 
you need to include `java-json.jar` by opening the `properies` of your project. Then click on `Java BuildPath` 
and `Add External JAR`. Select the location of the file and apply all changes. Now you are set up to use the 
complete example.

Don't forget to add your username and password in the OkapiConnectorTest.java. You do not have an account yet? 
Do so on [okapiorbits.space/signup](https://okapiorbits.space/signup.html)!

### Create a launch configuration
The OkapiConnectorTest.java contains a runnable part which can be used to create an Eclipse Application configuration. 
Under `Run Configurations` (green run button) choose `Java Application` and choose `New launch configuration`. Type the 
name e.g. `OkapiConnectorTest` and select the `OkapiJavaConnector` in the `Project`section. For the `Main class` input click 
the `search` button. It should find the OkapiConnectorTest.java file. You can select this file. This is it! You can now proceed 
and run the program.

### Documentation
For further information on the available end points of the OKAPI API and the documentation visit 
[okapiorbits.space/documentation](https://okapiorbits.space/documentation).