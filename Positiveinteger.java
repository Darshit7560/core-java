package java_28_5;

import java.util.Scanner;

public class Positiveinteger {
	public static void main(String[] args) 
	{
		int count=0;
		Scanner r=new Scanner(System.in);
		System.out.println("Enter a  positive integer number");
		int num=r.nextInt();
		
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		System.out.println("number digit is "+ count);
	}
	

}
