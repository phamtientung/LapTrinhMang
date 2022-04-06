import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class server1 extends Thread {
		Socket socketClient;
		int id = -1;
		

		public server1(Socket socketClient, int id) {
			super();
			this.socketClient = socketClient;
			this.id = id;
			
		}	
		Void GuiFile(String tenFile) throws IOException{
			// lấy về nhập từ file
			FileReader fr = new FileReader(tenFile);
			BufferedReader buffRead = new BufferedReader(fr);
			// lấy về luồng xuất ( để gửi client)
			OutputStream osToClient = socketClient.getOutputStream();
			OutputStreamWriter writer2Client = new BufferedReader(write2Client);
			// đọc từng dòng
			Sing line;
			while((line = buffRead.readLine()) != null)
			{
				// gửi về
				buffwrite.write(line);
				buffwrite.flush();
			}
			fr.close();
			
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
				
				
				
				
				
					
				while(true)
				{
					// nhận dữ liệu
				String chuoinhan = buffRead.readLine();
				int i=Integer.parseInt(chuoinhan);
				 
				 if(chuoinhan.equals("1"))
				 {
					 GuiFile("D: 1.txt");
				 }
				
				
				// in ra nếu muôn 
				// gửi trả
				String chuoigui = chuoinhan;
				buffwrite.write(chuoigui+"\n");
				buffwrite.flush();
				if(chuoigui.equals("")) break;
				
				}		
					
					}
			catch (Exception e) {
			
				e.printStackTrace();
			}
		}
}