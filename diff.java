// WAP to take input 2 numbers from the user and print their difference.

import java.util.*;

class diff{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter num2 : ");
		int num2 = sc.nextInt();
		System.out.print("Diff is :: "  + (num1 - num2));
	}
}