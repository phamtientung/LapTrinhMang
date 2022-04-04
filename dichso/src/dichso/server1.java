import java.io.BufferedReader;
import java.io.BufferedWriter;
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
				 switch(i)
	                {

	                    case 0:chuoinhan="ZERO";break;

	                    case 1:chuoinhan="ONE";break;

	                    case 2:chuoinhan="TWO";break;

	                    case 3:chuoinhan="THREE";break;

	                    case 4:chuoinhan="FOUR";break;

	                    case 5:chuoinhan="FIVE";break;

	                    case 6:chuoinhan="SIX";break;

	                    case 7:chuoinhan="SEVEN";break;

	                    case 8:chuoinhan="EIGHT";break;

	                    case 9:chuoinhan="NINE";break;
	                    
	                    case 10: break;
	                   

	                }
				 if(i == 10)
				 {
					 System.out.print("kết thúc" + chuoinhan);
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
