/*Using the while structure make a program that asks to the user an integer and show its square. 
The program will go on asking for an integer while the number given is different to 0.*/

import java.util.Scanner;

public class Ariketa4 {
	public static void main(String[] arg) {
		int num = 1;
		Scanner sc = new Scanner(System.in);
		
		while (num != 0){
			System.out.println("Enter a number:");
			num = sc.nextInt();
			num = num * num;
			System.out.println("This is its square: "+ num);
		}
	}
}
