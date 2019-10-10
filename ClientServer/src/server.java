import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {

	public static void main(String[] args) {
		try {
			System.out.println("Server Running");
			ServerSocket server = new ServerSocket(3004);
			Socket socket = server.accept();
			Scanner sc = new Scanner(socket.getInputStream());
			String s = sc.nextLine();
			System.out.println(s);
			 s = s.concat("Hey, how are you?");
			PrintStream reader = new PrintStream(socket.getOutputStream());
			reader.println(s);
			server.close();
			sc.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
