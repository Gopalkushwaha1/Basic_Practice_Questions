import java.util.*;

class next_date{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your day : " );
		int day = sc.nextInt();
		System.out.print("Enter your month : " );
		int month = sc.nextInt();
		System.out.print("Enter your year : " );
		int year = sc.nextInt();

		System.out.print("Your current date/month/year is : " + day + "/" + month + "/" + year);

		int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        
        	if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            	daysInMonth[1] = 29; // February has 29 days in a leap year
        	}

	        day++;

        	if (day > daysInMonth[month - 1]) {
            	day = 1; // Reset to the first day of the month
           	 month++; // Move to the next month
        	}

        	if (month > 12) {
            	month = 1; // Reset to January
            	year++; // Increment year
        	}

        	System.out.println();
        	System.out.println("The next date is: " + day + "/" + month + "/" + year);

		}
	} 
		