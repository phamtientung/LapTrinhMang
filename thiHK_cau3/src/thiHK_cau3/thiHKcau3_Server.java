package thiHK_cau3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class thiHKcau3_Server extends Thread {
	Socket socketClient;
	int id = -1;
	

	public thiHKcau3_Server(Socket socketClient, int id) {
		super();
		this.socketClient = socketClient;
		this.id = id;
		
	}

	@Override
	public void run() {
		try {
			
			System.out.print(socketClient.getInetAddress().getHostAddress());
			System.out.print(id);
			
			OutputStream osToClient = socketClient.getOutputStream();	
			OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
			BufferedWriter buffwrite = new BufferedWriter(write2Client);
		
			InputStream in = socketClient.getInputStream();
			InputStreamReader inReader = new InputStreamReader(in);
			BufferedReader buffRead = new BufferedReader(inReader);
			
			
			///int i=Integer.parseInt(chuoinhan);
			while(true) {
				String chuoinhan = buffRead.readLine();
				int n = Integer.parseInt(chuoinhan);
				if(n == 16) break;
				else {
					 int rem;
					 char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
					 String str2=""; 
				     while(n > 0)
				     {
				       rem = n % 16; 
				       str2=hex[rem]+str2; 
				       n = n / 16;
				     }
				     System.out.println("Method 2: Decimal to hexadecimal: "+str2);
				     String chuoigui=str2;
						buffwrite.write(chuoigui+"\n");
						buffwrite.flush();
						
				}
				
				
				
				
				
				 
					
				}
			/*// in ra nếu muôn 
						// gửi trả
						String chuoigui = chuoinhan;
						buffwrite.write(chuoigui+"\n");
						buffwrite.flush();*/
			

		}
		catch (Exception e) {
		
			e.printStackTrace();
			
		}
	}
}