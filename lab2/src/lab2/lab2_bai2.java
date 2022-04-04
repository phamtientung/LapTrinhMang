package lab2;
import java.util.Scanner;
public class lab2_bai2 {
	public static void GiaiPTB2(float a, float b, float c) {
		if(a==0)
		{
			lab2_bai1.GiaiPTB1(a, b);
		}else
		{
			float delta= (b*b)-(4*a*c);
			float x1,x2;
			
			//tinh nghiem
			if(delta>0)
			{
				x1=(float)((-b+Math.sqrt(delta)) / 2*a);
				x2=(float)((-b-Math.sqrt(delta)) / 2*a);
				System.out.println("PT co 2 nghiem: "+ "x1 = " + x1 +" va x2 = "+ x2);
			}else if(delta==0)
			{
				x1= (-b/(2*a));
				System.out.println("PT co nghiem kep: "+"x1 = x2 = "+x1);
			}else {
				System.out.println("PTVN");
			}
		}
	}
	
	public static void ptb2()
	{
		float a,b,c;
		Scanner nhap = new Scanner(System.in);
		
		System.out.println("Nhap he so a: ");
		a = nhap.nextFloat();
		System.out.println("Nhap he so b: ");
		b = nhap.nextFloat();
		System.out.println("Nhap he so c: ");
		c = nhap.nextFloat();
		
		GiaiPTB2(a,b,c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ptb2();
	}
}
