package lab3;
import java.util.Scanner;
public class lab3_bai1 {
	public static void main(String[] args) {
		int n;
		
		Scanner nhap = new Scanner(System.in);
		System.out.println("Nhap vao so n: ");
		n = nhap.nextInt();
		
		Boolean ok = true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				ok=false;
				break;
			}
		}
		
		if(ok==true)
		{
			System.out.println(n +" la SNT");
		}else
		{
			System.out.println(n +" khong phai la SNT");
		}
	}
}
