package lab1;
import java.util.Scanner;
public class lab1_bai4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		
		float a,b,c, delta;
		
		System.out.print("Nhap he so a cua pt bac 2:");
		a = nhap.nextFloat();
		System.out.print("Nhap he so b cua pt bac 2:");
		b = nhap.nextFloat();
		System.out.print("Nhap he so c cua pt bac 2:");
		c = nhap.nextFloat();
		
		delta= (float) Math.pow(b, 2)-4*a*c;
		System.out.println("Can delta la: "+Math.sqrt(delta));
	}
}
