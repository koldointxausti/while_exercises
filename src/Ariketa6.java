/*Using the while structure make a program that shows as many asterisk as the user indicates, 
all of them in the same line. The program will finish when the user inserts 0. */

import java.util.Scanner;

public class Ariketa6 {
	public static void main (String[] arg) {
		int num = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many asterik do you want me to show?");
		num = sc.nextInt();
		while (num != 0) {
			switch (num) {
			case 1 : System.out.println("*"); break;
			case 2 : System.out.println("**"); break;
			case 3 : System.out.println("***"); break;
			case 4 : System.out.println("****"); break;
			case 5 : System.out.println("*****"); break;
			case 6 : System.out.println("******"); break;
			case 7 : System.out.println("*******"); break;
			case 8 : System.out.println("********"); break;
			case 9 : System.out.println("*********"); break;
			case 10 : System.out.println("**********"); break;
			default : System.out.println("I can only show 10 asterisk.");
			}
			System.out.println("How many asterik do you want me to show?");
			num = sc.nextInt();
		}
		System.out.println("The program has been stopped.");
	}
}
