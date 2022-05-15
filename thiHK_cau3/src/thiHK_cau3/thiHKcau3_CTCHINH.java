package thiHK_cau3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class thiHKcau3_CTCHINH {

	public static void main(String[] args) throws IOException{
		// mở cổng bắt đầu nghe
		ServerSocket socketServer = new ServerSocket(8686);
		System.out.print("Tôi lắng nghe trong cổng 8686  ...");
		int id =0;
		while(true) {
			Socket s = socketServer.accept();
			
		thiHKcau3_Server luongTask = new thiHKcau3_Server(s, id);
		luongTask.start();
		
	}


	}
}
