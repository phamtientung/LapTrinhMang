import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class server {

	public static void main(String[] args) {
		Socket socketClient;
		int id = -1;
		

		public server(Socket socketClient, int id) {
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
				BufferedWriter buffW = new BufferedWriter(write2Client);
			
				InputStream in = socketClient.getInputStream();
				InputStreamReader inReader = new InputStreamReader(in);
				BufferedReader buffR = new BufferedReader(inReader);
					
					//Gá»­i hello
					String chuoiHello_Gui = "Hello báº¡n muá»‘n tráº£ vá»� sá»‘  máº¥y nÃ o ? ";
					buffW.write(chuoiHello_Gui+ "\n" );
					buffW.flush();
					//Nháº­n vá»� sÃ´ vÃ  tráº£ lá»�i
					String chuoiSo0_Nhan = buffR.readLine();
					String chuoiTraLoi0 = "Zero ";
					buffW.write(chuoiTraLoi0+ "\n" );
					buffW.flush();
					//Nháº­n vá»� sÃ´ vÃ  tráº£ lá»�i
					String chuoiSo01_Nhan = buffR.readLine();
					String chuoiTraLoi01 = "One ";
					buffW.write(chuoiTraLoi01+ "\n" );
					buffW.flush();
					//Nháº­n vá»� sÃ´ vÃ  tráº£ lá»�i
					String chuoiSo02_Nhan = buffR.readLine();
					String chuoiTraLoi02 = "Two ";
					buffW.write(chuoiTraLoi02+ "\n" );
					buffW.flush();
					//Nháº­n vá»� sÃ´ vÃ  tráº£ lá»�i
					String chuoiSo03_Nhan = buffR.readLine();
					String chuoiTraLoi03 = "Three ";
					buffW.write(chuoiTraLoi03+ "\n" );
					buffW.flush();
					//Nháº­n vá»� sÃ´ vÃ  tráº£ lá»�i
					String chuoiSo04_Nhan = buffR.readLine();
					String chuoiTraLoi04 = "For ";
					buffW.write(chuoiTraLoi04+ "\n" );
					buffW.flush();
					//Nháº­n vá»� sÃ´ vÃ  tráº£ lá»�i
					String chuoiSo05_Nhan = buffR.readLine();
					String chuoiTraLoi05 = "Five ";
					buffW.write(chuoiTraLoi05+ "\n" );
					buffW.flush();
					//Nháº­n vá»� sÃ´ vÃ  tráº£ lá»�i
					String chuoiSo06_Nhan = buffR.readLine();
					String chuoiTraLoi06 = "Six ";
					buffW.write(chuoiTraLoi06+ "\n" );
					buffW.flush();
					//Nháº­n vá»� sÃ´ vÃ  tráº£ lá»�i
					String chuoiSo07_Nhan = buffR.readLine();
					String chuoiTraLoi07 = "Seven ";
					buffW.write(chuoiTraLoi07+ "\n" );
					buffW.flush();
					//Nháº­n vá»� sÃ´ vÃ  tráº£ lá»�i
					String chuoiSo08_Nhan = buffR.readLine();
					String chuoiTraLoi08 = "Eight ";
					buffW.write(chuoiTraLoi08+ "\n" );
					buffW.flush();
					//Nháº­n vá»� sÃ´ vÃ  tráº£ lá»�i
					String chuoiSo09_Nhan = buffR.readLine();
					String chuoiTraLoi09 = "Nine ";
					buffW.write(chuoiTraLoi09+ "\n" );
					buffW.flush();
					//Nháº­n vá»� sÃ´ vÃ  tráº£ lá»�i
					String chuoiSo10_Nhan = buffR.readLine();
					String chuoiTraLoi10 = "Ten ";
					buffW.write(chuoiTraLoi10+ "\n" );
					buffW.flush();
			
					
					buffW.flush();
					}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	}

}
