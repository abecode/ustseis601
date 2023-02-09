// Demonstrates reading Environment Variables, a useful way to get
// contextual and potentially secret information into a program

public class TestEnvVars {
    public static void main(String[] args){
        for (String key : System.getenv().keySet()) {
            System.out.println("key:" + key + " value:" + System.getenv(key));
        }
    }
}
