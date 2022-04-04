package tiil;

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

public class AppPTClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			Socket soc = new Socket("localhost", 8888); // gửi yêu cầu tới server
			
			System.out.print("Connected! \n");
			// lấy luồng nhập, xuất
			InputStream in = soc.getInputStream();
			InputStreamReader inReader = new InputStreamReader(in); 
			BufferedReader buffRead = new BufferedReader(inReader);
			
			OutputStream osTcClient = soc.getOutputStream();
			OutputStreamWriter Write2Client = new OutputStreamWriter(osTcClient);
			BufferedWriter buffwrite = new BufferedWriter(Write2Client);
			
			// lấy chuỗi nhập từ banf phím
				Scanner banphim = new Scanner(System.in);
				
			// giao tiếp theo giao thức thiết kế ==========
			/*String chuoimoinhapa_nhan = buffRead.readLine();
			// in ra đẻ xem
			System.out.print("server :"+chuoimoinhapa_nhan );
			//
			String chuoia_gui = "nhập a";
			buffwrite.write(chuoia_gui + "\n");
			buffwrite.flush();*/
			//==============================================
			
			
			//==========chuỗi nhận a=======================
			String chuoimoinhapa_nhan = buffRead.readLine();
			// in ra dể xem
			System.out.print("\nserver :"+chuoimoinhapa_nhan );
			// trả lời cho server====================
				// bảo user đưa b từ bàn phím
			System.out.print("\n Client :(nhập a) :");
			String chuoitraloia_gui = banphim.nextLine();
			// gửi đến server
			buffwrite.write(chuoitraloia_gui);
			buffwrite.flush();
			
			
			//==========chuỗi nhận b=======================
			String chuoimoinhapb_nhan = buffRead.readLine();
			// in ra dể xem
			System.out.print("\nserver :"+chuoimoinhapb_nhan );
			// trả lời cho server====================
				// bảo user đưa b từ bàn phím
			System.out.print("\n Client :(nhập b) :");
			String chuoitraloib_gui = banphim.nextLine();
			// gửi đến server
			buffwrite.write(chuoitraloib_gui);
			buffwrite.flush();
			
			//==========chuỗi nhận hỏi phép toán=======================
			String chuoihoipheptoan_nhan = buffRead.readLine();
			// in ra dể xem
			System.out.print("\nserver :"+chuoihoipheptoan_nhan );
			// trả lời cho server====================
				// bảo user đưa tên từ bàn phím
			System.out.print("\n Client :(nhập phép toán(+;-;*;/)) :");
			String chuoitraloipheptoan_gui = banphim.nextLine();
			// gửi đến server
			buffwrite.write(chuoitraloipheptoan_gui);
			buffwrite.flush();
			//================================================
			
			//==========chuỗi nhận kq=======================
			String kq_nhan = buffRead.readLine();
			// in ra dể xem
			System.out.print("\nserver :"+kq_nhan );
			buffwrite.flush();
			
			
			
			//==========chuỗi nhận hỏi làm tiếp hay không======================
			String chuoihoilamtiephayko_nhan = buffRead.readLine();
			// in ra dể xem
			System.out.print("\nserver :"+chuoihoilamtiephayko_nhan );
			// trả lời cho server====================
				// bảo user đưa tên từ bàn phím
			System.out.print("\n Client :nhập có hoặc không :");
			String chuoitraloihoilamtiephayko_gui = banphim.nextLine();
			// gửi đến server
			buffwrite.write(chuoitraloihoilamtiephayko_gui);
			buffwrite.flush();
			//================================================
			
			// nhấn k để kết thúc========
			System.out.print("\n Client :nhấn k để kết thúc :");

		
				
			}
		
		
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		}
	}

}