package sparkjar;

import spark.Request;
import spark.Response;
import spark.Spark;

public class Application {

    public static void main(String[] args){
        Spark.port(getHerokuAssignedPort());
        Spark.get("/hello"  , (req,res) -> "Hello world");
        Spark.get("/hello/:name"  , (req,res) -> "Hello "+req.params(":name"));
        Spark.get("/greeting"  , (req,res) -> greeting(req,res));
    }

    private static Greeting greeting(Request req, Response res) {
        return new Greeting(1l, "Haj");
    }

    private static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567;
    }

}
