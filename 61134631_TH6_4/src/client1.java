import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class client1 {
	public static void main(String[] args) {
		try {
			Socket soc = new Socket("localhost",8989);
			System.out.print("Conected!\n");
			
			InputStream in = soc.getInputStream();
			InputStreamReader inReader = new InputStreamReader(in);
			BufferedReader buffRead = new BufferedReader(inReader);
	
			OutputStream osToClient = soc.getOutputStream();	
			OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
			BufferedWriter buffwrite = new BufferedWriter(write2Client);
			
			Scanner banPhim = new Scanner(System.in);
			
			while(true)
			{
				System.out.print("\nclient: ");
				System.out.print("nhập vào số 1 đến 10(nhập 0 để kết thúc) :" );
				String chuoigui = banPhim.nextLine();
				// gửi đi, nếu chuỗi phải là Bye
				buffwrite.write(chuoigui+"\n");
				buffwrite.flush();
				
				// nhận về
				String chuoinhan = buffRead.readLine();
				// in ra màn hình client để xem
				System.out.print("Server: "+ chuoinhan );
				
				if(chuoigui.equals("10")) break;
			}
				soc.close();	
			
			
		
				//buffwrite.flush();
	
					
	
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}
