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
public class Client {
	public static void main(String[] args) {
		try (Socket client = new Socket("localhost", 8888);
				PrintWriter out = new PrintWriter(client.getOutputStream());
				BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()))) {
			out.println("hello server!");
			out.flush();
			
			System.out.println(in.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
