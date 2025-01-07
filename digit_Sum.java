// Q6 WAP to take input 3 digit numbers from the user and print sum of 1 and 3 digit.

import java.util.*;

class digit_Sum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 3 digit number : " );
		int num = sc.nextInt();
		int last_Digit = num/100;
		int first_Digit = (num%100)%10;
		System.out.println("Sum of first and last digit of number is :: " + (last_Digit + first_Digit) );
	}
}