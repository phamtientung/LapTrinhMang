import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;

// mở cổng dịch vụ 8888 và lắng nghe/ đợi chờ kết nối
public class AppServer {

	public static void main(String[] args) throws IOException {
		try {
			// mở cổng và bắt đầu nghe
			ServerSocket Socketserver = new ServerSocket(8888);
			System.out.println("I'm listening on 8888 port...");
			// luôn luôn lắng nghe
				while(true)
				{
					// khi có 1 yêu cầu tới, ,thì Accept
					// mở 1 Socket để làm viêc với client đó
					Socket socketClient =  Socketserver.accept();
					// gửi trả câu "XIN CHÀO"
						// b1. lấy về luồng xuất
					OutputStream osTcClient = socketClient.getOutputStream();
					// để gửi chuỗi cho tiện
					OutputStreamWriter Write2Client = new OutputStreamWriter(osTcClient);
					BufferedWriter buffw = new BufferedWriter(Write2Client);
					// gửi
					buffw.write("XIN CHÀO \n");
					buffw.flush();
					// đóng socket
					socketClient.close();
				}
			}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
