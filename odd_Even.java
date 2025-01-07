// WAP to check whether a number is even or odd.

import java.util.*;

class odd_Even{	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number : ");
		int num = sc.nextInt();
		if(num%2 == 0){
			System.out.println("This is even number : " + num );
			}
		else {
			System.out.println("This is odd number : " + num );
			}

	}
}