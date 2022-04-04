import java.net.ServerSocket;
import java.net.Socket;



public class CTchinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket socketServer = new ServerSocket(8888);
		System.out.print("  ...");
		int id =0;
		while(true) {
			Socket s = socketServer.accept();
			//new LuongLamViec(s, id++).start();
			server luongTask = new server(s, id);
			luongTask.start();
		}
				}
}

	
