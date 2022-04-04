
public class client {

	public static void main(String[] args) {
		try {
			Socket soc = new Socket("localhost",9999);
			System.out.print("Conected!\n");
			
			InputStream in = soc.getInputStream();
			InputStreamReader inReader = new InputStreamReader(in);
			BufferedReader buffR = new BufferedReader(inReader);

			OutputStream osToClient = soc.getOutputStream();	
			OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
			BufferedWriter buffW = new BufferedWriter(write2Client);
			
			Scanner banPhim = new Scanner(System.in);
			//=====THIẾT KẾ GIAO THỨC ======
			String chuoiHello_Nhan = buffR.readLine();
			System.out.println(" server: " + chuoiHello_Nhan);
			
			String chuoiSo0_Gui = "0";
			buffW.write(chuoiSo0_Gui +"\n");
			buffW.flush();
			String chuoiSo0_Nhan = buffR.readLine();
			System.out.println(" server: " + chuoiSo0_Nhan);
			
			String chuoiSo1_Gui = "";
			buffW.write(chuoiSo1_Gui +"\n");
			buffW.flush();
			String chuoiSo1_Nhan = buffR.readLine();
			System.out.println(" server: " + chuoiSo1_Nhan);
			
			String chuoiSo2_Gui = "2";
			buffW.write(chuoiSo2_Gui +"\n");
			buffW.flush();
			String chuoiSo2_Nhan = buffR.readLine();
			System.out.println(" server: " + chuoiSo2_Nhan);
			
			String chuoiSo3_Gui = "3";
			buffW.write(chuoiSo3_Gui +"\n");
			buffW.flush();
			String chuoiSo3_Nhan = buffR.readLine();
			System.out.println(" server: " + chuoiSo3_Nhan);
			
			String chuoiSo4_Gui = "4";
			buffW.write(chuoiSo4_Gui +"\n");
			buffW.flush();
			String chuoiSo4_Nhan = buffR.readLine();
			System.out.println(" server: " + chuoiSo4_Nhan);
			
			String chuoiSo5_Gui = "5";
			buffW.write(chuoiSo5_Gui +"\n");
			buffW.flush();
			String chuoiSo5_Nhan = buffR.readLine();
			System.out.println(" server: " + chuoiSo5_Nhan);
			
			String chuoiSo6_Gui = "6";
			buffW.write(chuoiSo6_Gui +"\n");
			buffW.flush();
			String chuoiSo6_Nhan = buffR.readLine();
			System.out.println(" server: " + chuoiSo6_Nhan);
			
			String chuoiSo7_Gui = "7";
			buffW.write(chuoiSo7_Gui +"\n");
			buffW.flush();
			String chuoiSo7_Nhan = buffR.readLine();
			System.out.println(" server: " + chuoiSo7_Nhan);
			
			String chuoiSo8_Gui = "8";
			buffW.write(chuoiSo8_Gui +"\n");
			buffW.flush();
			String chuoiSo8_Nhan = buffR.readLine();
			System.out.println(" server: " + chuoiSo8_Nhan);
			
			String chuoiSo9_Gui = "9";
			buffW.write(chuoiSo9_Gui +"\n");
			buffW.flush();
			String chuoiSo9_Nhan = buffR.readLine();
			System.out.println(" server: " + chuoiSo9_Nhan);
			
			String chuoiSo10_Gui = "10";
			buffW.write(chuoiSo10_Gui +"\n");
			buffW.flush();
			String chuoiSo10_Nhan = buffR.readLine();
			System.out.println(" server: " + chuoiSo10_Nhan);

					buffW.flush();

			
		} catch (Exception e) {
			e.printStackTrace();
		}
			}

	

}
