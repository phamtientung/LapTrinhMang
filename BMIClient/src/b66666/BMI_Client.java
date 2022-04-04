package b66666;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class BMI_Client {

	public static void main(String[] args) {
		try {
			Socket soc = new Socket("localhost", 8989); // gửi yêu cầu tới server
			
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
			String chuoiHello_nhan = buffRead.readLine();
			// in ra đẻ xem
			System.out.print("BMI server :"+chuoiHello_nhan );
			//
			String chuoiXinchao_gui = "xin chào";
			buffwrite.write(chuoiXinchao_gui + "\n");
			buffwrite.flush();
			//==============================================
			
			//==========chuỗi nhận hỏi tên=======================
			String chuoihoiten_nhan = buffRead.readLine();
			// in ra dể xem
			System.out.print("\nBMI server :"+chuoihoiten_nhan );
			// trả lời cho server====================
				// bảo user đưa tên từ bàn phím
			System.out.print("\nBMI Client :(nhập tên bạn) :");
			String chuoitraloiten_gui = banphim.nextLine();
			// gửi đến server
			buffwrite.write(chuoitraloiten_gui);
			buffwrite.flush();
			
			// ==============================================
			//==========chuỗi nhận hỏi chiều cao=======================
			String chuoihoichieucao_nhan = buffRead.readLine();
			// in ra dể xem
			System.out.print("\nBMI server :"+chuoihoichieucao_nhan );
			// trả lời cho server====================
				// bảo user đưa tên từ bàn phím
			System.out.print("\nBMI Client :(nhập chiều cao của bạn(cm)) :");
			String chuoitraloichieucao_gui = banphim.nextLine();
			// gửi đến server
			buffwrite.write(chuoitraloichieucao_gui);
			buffwrite.flush();
			//================================================
			
			//=======chuỗi hỏi cân nặng===============
			String chuoihoicannang_nhan = buffRead.readLine();
			// in ra dể xem
			System.out.print("\nBMI server :"+chuoihoicannang_nhan );
			// trả lời cho server====================
				// bảo user đưa tên từ bàn phím
			System.out.print("\nBMI Client :(nhập cân nặng của bạn(kg)) :");
			String chuoihoicannang_gui = banphim.nextLine();
			// gửi đến server
			buffwrite.write(chuoihoicannang_gui);
			buffwrite.flush();
			
			//=====================================================
			
			// nhận 1: thông tin đang tính
			String chuoidangtinh_nhan = buffRead.readLine();
			// in ra màn hình user xem
			System.out.print("\nBMI server :"+chuoidangtinh_nhan );
			
			// nhận 2: thông tin đang tính
						String chuoikq_nhan = buffRead.readLine();
						
						// in ra màn hình user xem
						System.out.print("\nBMI server :"+chuoikq_nhan );
						

			
			

			//==============================================		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
