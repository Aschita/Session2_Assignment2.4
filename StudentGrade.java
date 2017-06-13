package Demo;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) { //Main Method
		// TODO Auto-generated method stub
		 int mark[] = new int[3];
	        int i;
	        float sum=0, avg;
	        @SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			
	        System.out.print("Enter Marks Obtained in P C and M : ");
	        for(i=0; i<3; i++) // Reading the input from the user.
	        {
	            mark[i] = scan.nextInt();
	            sum = sum + mark[i];
	        }
			//Displaying the output 
	        System.out.println("Marks Obtained in Physics:" +mark[0]);
			System.out.println("Marks Obtained in Chemistry:" +mark[1]);
			System.out.println("Marks Obtained in Mathematics:" +mark[2]);
	        
			avg = sum/3; //Calculating the avg of Physics Chemistry and Mathematics
			
	        System.out.print("Your Grade is "); //Displaying the Grade of the student based on the avg mark calculated in the previous step
	        if(avg>70)
	        {
	            System.out.print("A");
	        }
	        else if(avg>=61 && avg<=70)
	        {
	            System.out.print("B");
	        }
	        else
	        {
	            System.out.print("C");
	        }
	        
	}

}
