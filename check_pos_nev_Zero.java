// WAP to check whether the number is positive, negative or zero.

import java.util.*;

class check_pos_nev_Zero{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number : " );
		int num = sc.nextInt();
		if(num == 0){
			System.out.print("Your number is 0" );
			return ;
			}
		else if(num > 0){
			System.out.print("Your number is postive " );
			return ;
				}
		System.out.print("Your number is negative " );
	}
}