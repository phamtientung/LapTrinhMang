package lab3;
import java.util.Arrays;
import java.util.Scanner;
public class lab3_bai3 {
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		
		int n;
		System.out.print("Nhap so phan tu cua mang: ");
		n = nhap.nextInt();
		int mang[] = new int [n];
		
		for(int i=0;i<n;i++)
		{
			System.out.printf("Nhap gia tri pha tu thu "+i);
			mang[i] = nhap.nextInt();
		}
		Arrays.sort(mang);
		System.out.println("Mang vua nhap da sap xep la: "+Arrays.toString(mang));
		
		int min=mang[0];
		for(int i=0;i<n;i++)
		{
			if(min>mang[i]) {
				min=mang[i];
			}
		}
		System.out.println("Phan tu nho nhat cua mang la: "+min);
		
		float count=0;
		int tong=0;
		for(int i=0;i<n;i++)
		{
			if(mang[i]%3==0) {
				tong +=mang[i];
				count++;
			}
		}
		float trungbinh = (float) tong/count;
		System.out.println("TBC cac so chia het cho 3 la: "+trungbinh);
	}

}
