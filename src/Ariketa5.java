/*Using the while structure make a program that asks for two integers and goes on 
asking for two new integers while those numbers are different to 123 and 321.*/

import java.util.Scanner;

public class Ariketa5 {
	public static void main (String[] arg) {
		int num1 = 0;
		int num2 = 0;
		Scanner sc = new Scanner(System.in);
		
		while (!((num1 == 123)&&(num2 == 321))||((num2 == 123)&&(num1 == 321))) {
			System.out.println("Enter two numbers:");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
		}
		System.out.println("The program has been stopped");
	}
}
