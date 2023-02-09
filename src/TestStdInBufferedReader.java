// demonstrates BufferedReader to read lines from StdIn
// for more info see: 
//   https://www.geeksforgeeks.org/difference-between-scanner-and-bufferreader-class-in-java/

// Importing required class
import java.io.*;

public class TestStdInBufferedReader {
    public static void main(String[] args)
    throws IOException // needed to show we are aware of IOExceptions
    {
        // Create unnamed object of class InputStreamReader
        // Then create object of class BufferedReader
        // and assign it to variable br (name it br)
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));    
        /* if we didn't have the import stmt, we could do this:
        java.io.BufferedReader br = new java.io.BufferedReader(
        new java.io.InputStream(System.in)
        );
        */
        String line = br.readLine();
        while(line != null){
            System.out.println("Got: " + line);
            line = br.readLine();
        }
    }   
}
