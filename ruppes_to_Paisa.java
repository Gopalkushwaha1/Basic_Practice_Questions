import java.util.*;

class ruppes_to_Paisa{
// WAP to take input rupees from the user and convert it into paise.
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your amount in ruppes : " );
		int rups = sc.nextInt();
		System.out.println("Your amount in Paisa is :: " + (100*rups));
	}
}