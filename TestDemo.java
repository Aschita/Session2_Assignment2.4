package Demo;

import java.util.Scanner;

public class TestDemo {
	
	private static Scanner sc;
	
	public static void main(String[] args) //Main Method
	{
		sc = new Scanner(System.in);
		   System.out.println(" Please Enter the value ");
		int  n1= sc.nextInt();
		if(n1 == 0)
		  System.out.println("You have Entered ZERO ");
		else if (n1 < 0)
		   System.out.println("You have Entered Negative value ");
		else 
			System.out.println("You have Entered positive value ");
		
		sc = new Scanner(System.in); //Reading the input again to convert in ASCII format and displaying it again
		System.out.println("Please Enter the value again: ");
		String n11 = sc.nextLine();
		char[] ascii1 = n11.toCharArray();

		for(char ch:ascii1){
		    System.out.println("The ASCII value is: "+ (int)ch);
		    sc.close();
		}
	}
}