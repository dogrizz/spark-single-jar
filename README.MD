##What is this
Just an attempt at creating a single jar app deployable on heroku.
This one uses sparkjava which runs on jetty.

## Build and run
Building:
`./gradlew shadowJar`
Run
Either `./gradlew run` or `java -jar build/libs/spark-single-jar-all.jar`

##Demo
https://guarded-waters-7028.herokuapp.com/hello/Jerzy
https://guarded-waters-7028.herokuapp.com/hello
https://guarded-waters-7028.herokuapp.com/greeting

##Resources
http://sparkjava.com/
https://www.twilio.com/blog/2015/09/getting-started-with-gradle-and-the-spark-framework-3.html
https://github.com/johnrengelman/shadow