package lab1;

import java.util.Scanner;
public class lab1_bai3 {
	public static void main(String[] args) {

		Scanner nhap = new Scanner(System.in);
		
		float canh;
		
		System.out.print("Nhap canh cua hinh lap phuong:");
		canh = nhap.nextFloat();
		
		System.out.println("The tich hinh lap phuong: "+Math.pow(canh,3));
	}

}
