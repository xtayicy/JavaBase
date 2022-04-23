package harry.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 
 * @author harry
 *
 */
public class Server{
	public static void main(String[] args) {
		try (ServerSocket serverSocket = new ServerSocket(8888)){
			while(true){
				Socket client = serverSocket.accept();
				new Thread(new ClientHandler(client)).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
