// The skeleton program for Server
import java.net.*;
import java.io.*;

public class Server
{
	//input stream defined
    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream in = null;

    public Server(int port){
    	try{
    		server = new ServerSocket(port);
    		System.out.printlin("Server Started");

    		System.out.println("Waiting for a client to connect...");

    		socket = server.accept();
    		System.out.printlin("Client connection accepted");

    		in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
    		String line = "";

    		while(!line.equals("Done"))
    		{
    			try{
    				line = in.readUIF();
    				System.out.printlin(line);
    			}
    			catch(IOException) {
    				System.out.printlin(i);
    			}
    		}
    		socket.close();
    		in.close();
    	}
    	catch(IOException)
    	{
    		System.out.printlin(i);
    	}
    }
}

    public static void main(String args[])
    {
        Server server = new Server(5000);
    }
}
