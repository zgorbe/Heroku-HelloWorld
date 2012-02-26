# Build

Build the project with

    $ mvn clean install

# Run

Now you can run your webapp with:

java -jar heroku-web/target/dependency/jetty-runner.jar heroku-web/target/*.war

You can run the worker process with:

heroku-worker/target/bin/workerprocess