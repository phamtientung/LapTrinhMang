package tiil;

import java.awt.image.DataBufferFloat;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class appPTServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			// mở cổng và bắt đầu nghe
			ServerSocket Socketserver = new ServerSocket(8888);
			System.out.println("I'm listening on 8989 port...");
			// luôn luôn lắng nghe
			while(true)
			{
					// khi có 1 yêu cầu tới, ,thì Accept
					// mở 1 Socket để làm viêc với client đó
					Socket socketClient =  Socketserver.accept(); // chấp nhận kết nối vs client
				//  lấy về luồng xuất			
					OutputStream osTcClient = socketClient.getOutputStream();
					OutputStreamWriter Write2Client = new OutputStreamWriter(osTcClient);
					BufferedWriter buffwrite = new BufferedWriter(Write2Client);
					
					InputStream in = socketClient.getInputStream();
					InputStreamReader inReader = new InputStreamReader(in); 
					BufferedReader buffRead = new BufferedReader(inReader);
					
					DataInputStream dis = new DataInputStream(socketClient.getInputStream());
					
					// ===== giao tiếp theo giao thức thiết kế
					while(true)
					{
						
						// ---------server gửi qua client
				
						String chuoimoinhapa_gui = "mời nhập a";
						float a = in.read();
						buffwrite.write(chuoimoinhapa_gui + "\n");
						buffwrite.flush();
						
						// nhận phản hồi a từ client và mời nhập b=========
						String chuoimoinhana_nhan = buffRead.readLine();
						String chuoimoinhapb_gui = "mời nhập b \n";
						float b = in.read();

						buffwrite.write(chuoimoinhapb_gui + "\n");
						buffwrite.flush();
						
						
						// nhận trả lời nhập b, và hỏi phép toán
						String chuoimoinhapb_nhan = buffRead.readLine();
						String chuoihoipheptoan = "mời bạn nhập vào phép toán (+;-;*;/) \n";
						
						buffwrite.write(chuoihoipheptoan + "\n");
						buffwrite.flush();
				
						// nhận trả lời phép toán và xử lí
						String chuoihoipheptoan_nhan = buffRead.readLine();
						
						String kq = dis.readUTF();
						
						float z = 0;
						switch(kq)
						{
							case "+": 	z = a + b;
										kq +=""+ z; break;
								
							case "-": 	z = a - b;
							          	kq +=""+ z; break;
							
							case "*": 	z = a * b;
										kq +=""+ z; break;
							
							case "/":
										if(b == 0)
										{
											kq = "không thể chia cho 0";
										}
										else
										{
											 z = a / b;
											kq +=""+ z; break;
										}
										
							default: break;
										
						}
						
						buffwrite.write(kq + "\n");
						buffwrite.flush();
						
						
						// gửi hỏi có làm tiếp hay không
					
						String chuoihoilamtiephayko_gui = "bạn có muốn làm tiếp hay không \n";
						buffwrite.write(chuoihoilamtiephayko_gui + "\n");
						buffwrite.flush();
						
						

						// nhận trả lời hỏi làm tiếp hay ko, và trả lời
						String chuoitraloihoilamtiephayko_nhan = buffRead.readLine();					
						if(chuoitraloihoilamtiephayko_nhan == "có")
						{
							//return true;
						}
						else 
							{
							if(chuoitraloihoilamtiephayko_nhan == "k") break;
							
							}		
						buffwrite.flush();
						
						
			}
		}
	}
		
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		}
	}

}
