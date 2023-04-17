package ch17;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.stream.Collectors;

import com.sun.net.httpserver.*;

public class TmpHttpServer  implements HttpHandler {
    public void handle(HttpExchange t) throws IOException {
        InputStream is = t.getRequestBody();
        //read(is); // .. read the request body
        String result = new BufferedReader(new InputStreamReader(is))
                            .lines().collect(Collectors.joining("\n"));  
        System.out.println(result);
        String response = "This is the response";
        t.sendResponseHeaders(200, response.length());
        OutputStream os = t.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/applications/myapp", new TmpHttpServer());
        server.setExecutor(null); // creates a default executor
        server.start();
    }
}
