package deliverable1;

import java.util.Scanner;

public class deli1 {
	/* 

	Write a Java Console program to perform the following task: 
	 
	Input: Your program should read two integer numbers from the user with the same number of digits (example: number1= 234, number2 = 564). 
	 
	Task: Check if each corresponding place in the two numbers (ones, tens, hundreds, …) sums to the same total.   
	 
	Output: Your program should print out: True or False based on the result.  
	 */	




	

	public static void main(String[]args) {
		Scanner s1 = new Scanner (System.in);
		System.out.println("Enter the first number:");
		int f=s1.nextInt();
		System.out.println("enter the scond number");
		int s=s1.nextInt();
		System.out.println(getresult(f,s));
		
	}
	public static boolean getresult(int f,int s) {
		int res1=(f%10)+(s%10);
		int res2=((f%100-(f%10))/10)+((s%100-(s%10))/10);
		int res3=(f/100)+(s/100);
		if (res1==res2&&res2==res3) {
			return true;
		}
		else {
			return false;
		}
	

		}



}




