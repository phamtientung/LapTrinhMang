package lab1;

import java.util.Scanner;
public class lab1_bai2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		
		float a,b,S,C;
		
		System.out.print("Nhap chieu dai: ");
		a = nhap.nextFloat();
		
		System.out.print("Nhap chieu rong: ");
		b = nhap.nextFloat();
		
		//tinh dien tich
		S=a*b;
		//tinh chu vu
		C=(a+b)*2;
		
		System.out.println("Chu vi hcn la: "+C);
		System.out.println("Dien tich hcn la: "+S);
		System.out.println("Canh nho nhat la: "+Math.min(a, b));
	}
}
