package tiil;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class AppEchoClient {

	public static void main(String[] args) {
		try {
			Socket soc = new Socket("localhost", 8888);
			
			System.out.print("Connected! \n");
			// lấy luồng nhập 
			InputStream in = soc.getInputStream();
			InputStreamReader inReader = new InputStreamReader(in); 
			BufferedReader buffRead = new BufferedReader(inReader);
			
			OutputStream osTcClient = soc.getOutputStream();
			OutputStreamWriter Write2Client = new OutputStreamWriter(osTcClient);
			BufferedWriter buffwrite = new BufferedWriter(Write2Client);
			// giao tiếp theo giao thức thiết kế ==========
			
			// lấy chuỗi nhập từ banf phím
			Scanner banphim = new Scanner(System.in);
			while(true)
			{
				
				System.out.print("\nclient: ");
				String chuoigui = banphim.nextLine();
				// gửi đi, nếu chuỗi phải là Bye
				
				buffwrite.write(chuoigui+"\n");
				buffwrite.flush();
					
				// nhận về
				String chuoinhan = buffRead.readLine();
				// in ra màn hình client để xem
				System.out.print("Server: "+ chuoinhan );
				
				if(chuoigui.equals("Bye")) break;
			}
				soc.close();
			
			
			
			
			//==============================================
			
	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
