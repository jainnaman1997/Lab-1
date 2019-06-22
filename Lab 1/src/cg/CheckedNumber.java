package cg;

import java.util.Scanner;

public class CheckedNumber {

	public static boolean checkNumber(int number) {
		int n=number, count=0;
		while(n>1) {
			n=n/2;
			count++;
		}
		if(number==Math.pow(2, count)) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a  natural  number");
		int number=sc.nextInt();
		boolean val=checkNumber(number);
		if(val==true) {
			System.out.println(number+" is a power of 2");
		}
		else {
			System.out.println(number+" is not a power of 2");
		}
		sc.close();

	}

}
