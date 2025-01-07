// Q5 WAP to take input days from the user and convert it into years, months, and remaining days.

import java.util.*;

class days_to_Year_Month{

// WAP to take input days from the user and convert it into years, months, and remaining days.

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Days : " );
		int days = sc.nextInt();
		int year = days/365; 
		int month = (days%365)/30;
		int remainDay = (days%365)%30;
		System.out.println("Your days equal to :: " + year + " years " + month + " month " + remainDay + " remainDay");
	}
}