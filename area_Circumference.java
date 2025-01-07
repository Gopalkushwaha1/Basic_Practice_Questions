// WAP to calculate and print area of circle and circumference of circle.

import java.util.*;


class area_Circumference{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius : ");
		int r = sc.nextInt();
		System.out.println("Area of circle is :: " + (3.14*r*r));
		System.out.println("Circumference of circle is :: " + (3.14*r*2));
	}
}