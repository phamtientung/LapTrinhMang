package thiHK_cau3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class thiHKcau3_Client {

	public static void main(String[] args) {
		try {
			Socket soc = new Socket("localhost",8686);
			System.out.print("Conected!\n");
			
			InputStream in = soc.getInputStream();
			InputStreamReader inReader = new InputStreamReader(in);
			BufferedReader buffRead = new BufferedReader(inReader);

			OutputStream osToClient = soc.getOutputStream();	
			OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
			BufferedWriter buffwrite = new BufferedWriter(write2Client);
			
			Scanner banPhim = new Scanner(System.in);
			while(true) {
				System.out.print("\nClient: nhập số bất kì từ 0 đến 16: ");
				String chuoiGui = banPhim.nextLine();
				buffwrite.write(chuoiGui+"\n");
				buffwrite.flush();
				
				
				String chuoiNhan = buffRead.readLine();
				System.out.print("Server: "+ chuoiNhan);
				if(chuoiGui.contains("end")) break;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}

}
}
