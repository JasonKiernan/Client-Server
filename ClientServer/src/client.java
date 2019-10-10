import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client {

	public static void main(String[] args) {

		try {
			Socket socket = new Socket("127.0.0.1",3004);
			Scanner sc = new Scanner(System.in);
			Scanner sc1 = new Scanner(socket.getInputStream());

			System.out.println("Please enter a String");
			String s = sc.nextLine();
			PrintStream pw = new PrintStream(socket.getOutputStream());
			pw.println(s);
			String st = sc1.nextLine();
			System.out.println(st);
					
			socket.close();
			sc.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	

	}

}
