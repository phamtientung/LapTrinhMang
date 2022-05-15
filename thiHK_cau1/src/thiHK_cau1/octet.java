package thiHK_cau1;

import java.util.Scanner;

public class octet {

	public static void main(String[] args) {
		while(true) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số tự nhiên N: ");
		String N = scanner.nextLine();
		int soN = Integer.parseInt(N);
		if (soN<255 && soN>0)
		{
			System.out.print("Số tự nhiên N là một Octet trong địa chỉ IP \n");
		}
		else 
			System.out.print("Số tự nhiên N không là một Octet trong địa chỉ IP");	
	}
	}
}
	


