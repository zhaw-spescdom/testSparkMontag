/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package testSparkMontag;

import spark.Spark;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
// Rest Service welcome added by Dominik
    public class Main {
        public static void main(String[] args) {
        Spark.get("/welcome", (req, res) -> {
        return "Hallo DevOps";}); 
// Rest Serivce groupname added by Dominik
        Spark.get("/groupname", (req, res) -> {
            return "G, wie Gurke";}); 
// Rest Serivce groupmember added by Jan
        Spark.get("/groupmember", (req, res) -> {
            return "Adrian, Dominik, Jan";}); 
        }
    }
}
