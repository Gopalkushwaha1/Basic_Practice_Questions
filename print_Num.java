// WAP to take input 4 digit numbers from the user and print its all digits.

import java.util.*;

class print_Num{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number : ");
		int num = sc.nextInt();
		System.out.print("Number are :: " );
		while(num > 0){
			System.out.print(num%10 + " " );
			num = num/10;
			}
		}
	}