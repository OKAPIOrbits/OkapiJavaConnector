# OkapiJavaConnector
Basic routines to init OKAPI services, send service execution requests and get results from the server.

### What you need to build
* Java SDK
* imports: java.io.IOException, java.util.concurrent.TimeUnit, org.json.JSONException, org.json.JSONObject
* Eclipse
* we tested it with Eclipse 2019-03 under Ubuntu 18.04

### The build process
This is a `first_exmaple` for sending a request to the OKAPI server and retrieving the results. It is set up under Eclipse 2019-03 and Ubuntu 18.04. You create a new project within Eclipse and select the directory where the OKAPI files are located. To get rid of the JSON errors, you need to include `java-json.jar` by opening the `properies` of your project. Then click on `Java BuildPath` and `Add External JAR`. Select the location of the file and apply all changes. Now you are set up to use the complete example.

