package lab2;
import java.util.Scanner;
public class lab2_bai3 {
	public static void tiendien() {
		int SoDien, tien;
		Scanner nhap = new Scanner(System.in);
		
		System.out.println("Nhap vao so dien su dung: ");
		SoDien = nhap.nextInt();
		
		if(SoDien<50)
		{
			tien = SoDien*1000;
		}else
		{
			tien = 50*1000 + (SoDien -50)*1200;
		}
		System.out.println("So tien phai tra: "+ tien +"VND");
	}
	public static void main(String[] args) {
		
		tiendien();
	}
}
