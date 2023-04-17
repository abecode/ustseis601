package ch17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

public class TmpClient {
    public static void main(String[] args) throws IOException {
        SocketChannel serverChannel = SocketChannel.open(
            new InetSocketAddress("127.0.0.1", 5001));
            Reader channelReader = Channels.newReader(serverChannel, StandardCharsets.UTF_8);

            // read
            BufferedReader in = new BufferedReader(channelReader);
            System.out.println(in.readLine());

            //write
            Writer writer = Channels.newWriter(serverChannel, StandardCharsets.UTF_8);
            PrintWriter out = new PrintWriter(writer);
            out.println("hello from the client");
            out.close();
    }
    
}
