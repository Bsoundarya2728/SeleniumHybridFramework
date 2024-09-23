package practise_Java;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		int num;//1234
		num = sc.nextInt();
		
		//1.algorithm
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("reverse "+rev);
	}
}
