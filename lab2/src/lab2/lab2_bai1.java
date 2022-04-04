package lab2;
import java.util.Scanner;
public class lab2_bai1 {
	public static void GiaiPTB1(float a, float b) {
		// TODO Auto-generated method stub
		if(a==0)
		{
			if(b==0)
			{
				System.out.println("PTVSN!");
			}
			else
			{
				System.out.println("PTVN!");
			}
		}
		else
		{
			float x = -b/a;
			System.out.println("PT co nghiem x= "+x);
		}
	}
	
	public static void ptb1() {
		
		Scanner nhap = new Scanner(System.in);
		float a,b;
		
		System.out.println("Nhap he so a: ");
		a = nhap.nextFloat();
		System.out.println("Nhap he so b: ");
		b = nhap.nextFloat();
		GiaiPTB1(a,b);
	}
	
	public static void main(String[] args) {
		ptb1();
	}
}
