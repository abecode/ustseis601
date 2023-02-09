// demonstrates Scanner to read lines from StdIn
// for more info see: 
//  https://www.geeksforgeeks.org/difference-between-scanner-and-bufferreader-class-in-java/

// Import class required for Scanner
import java.util.Scanner;

// Import class required for IOException
import java.io.IOException;

public class TestStdInScanner {

    public static void main(String[] args)
    throws IOException // needed to show we are aware of IOExceptions
    {
        // Create unnamed object of class InputStreamReader
        // Then create object of class BufferedReader
        // and assign it to variable br (name it br)
        Scanner scn = new Scanner(System.in);   
        /* if we didn't have the import stmt, we could do this:
        java.util.Scanner scn = new java.util.Scanner(System.in);
        */
        System.out.println("Enter an integer & a String");
        int a = scn.nextInt();
        String b = scn.nextLine();
        System.out.println("Got: " + a + ", " + b);
    }   
    
}
