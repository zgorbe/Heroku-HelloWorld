# Build

Build the project with

    $ mvn clean package

# Run

Now you can run your webapp with:

java $JAVA_OPTS -jar target/dependency/jetty-runner.jar --port $PORT target/*.war