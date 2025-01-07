// WAP to take input 3 digit numbers from the user and print the square of the middle digit.

import java.util.*;

class square_MidNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number : " );
		int num = sc.nextInt();
		System.out.print("Square of midle number is :: "  + ((num%100)/10)*((num%100)/10));
	}
}