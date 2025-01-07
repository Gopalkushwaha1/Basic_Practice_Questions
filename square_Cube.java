import java.util.*;

// Q2 WAP to take input 1 number from the user and print its square and cube.

class square_Cube{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number : ");
		int num = sc.nextInt();
		System.out.println("Square of " + num + " is :: " + (num*num));
		System.out.println("Cube of " + num + " is :: " + (num*num*num));
	}
}
