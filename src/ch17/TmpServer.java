package ch17;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class TmpServer {
    public static void main(String[] args) throws IOException {
        ServerSocketChannel serverChannel = ServerSocketChannel.open();
        serverChannel.bind(new InetSocketAddress(5001));
        SocketChannel clientChannel = serverChannel.accept();

        //to write
        PrintWriter out = new PrintWriter( Channels.newOutputStream(clientChannel));
        out.println("hello from the server");
        out.flush();

        // to read
        BufferedReader in = new BufferedReader (new InputStreamReader(Channels.newInputStream(clientChannel)));
        System.out.println(in.readLine());
    }
}

