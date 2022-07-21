package java_28_5;

import java.util.Scanner;

public class Asciivalue 
{
public static void main(String[] args) 
{
	char ch;
	Scanner r=new Scanner(System.in);
	System.out.println("Eneter a any Charector");
	ch=r.next().charAt(0);
	
	int a=ch;
	System.out.println("the ascii value of "+ch+"is"+a);
}
	
}
