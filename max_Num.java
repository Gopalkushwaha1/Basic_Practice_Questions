// Q10 WAP to take input two numbers from the user and print the largest of them

import java.util.*;

class max_Num{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter num2 : ");
		int num2 = sc.nextInt();
		if(num1 > num2){
			System.out.print("num1 is greater than num2 " + num1 + " > " + num2);
			return;
				}
		System.out.print("num2 is greater than num1 :: " + num2 + " > " + num1);
	}
}