package assignment1;

import java.util.Scanner;

public class Range {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a Value");
	int a=s.nextInt();
	if(a>10 && a<100)
	{
		System.out.println("value is in the Range");
	}
	else
	{
		System.out.println("value is Not in the Range");
	}
	}

}
