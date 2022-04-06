import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CTchinh {

	public static void main(String[] args) throws IOException{
		// mở cổng bắt đầu nghe
				ServerSocket socketServer = new ServerSocket(8989);
				System.out.print("Tôi lắng nghe trong cổng 9999  ...");
				int id =0;
				while(true) {
					//Socket s = socketServer.accept();
					Socket s = socketServer.accept();
					//new LuongLamViec(s, id++).start();
					server1 luongTask = new server1(s, id);
					luongTask.start();
					
					
					
	}


	}
}
