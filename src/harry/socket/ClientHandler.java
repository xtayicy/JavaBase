package harry.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 
 * @author harry
 *
 */
public class ClientHandler implements Runnable {
	private Socket client;

	public ClientHandler(Socket client) {
		this.client = client;
	}

	@Override
	public void run() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
				PrintWriter out = new PrintWriter(client.getOutputStream())) {
			String msg = br.readLine();
			System.out.println("收到" + client.getInetAddress() + "发送的: " + msg);
			out.println("hello client");
			out.flush();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				client.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
