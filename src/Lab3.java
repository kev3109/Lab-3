import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cont = "y";
		String name;
		System.out.println("Hello whats is your name");
		name = scan.next();
		System.out.println("Nice to meet you " + name);
		
		while (cont.equalsIgnoreCase("y")) {
			System.out.printf("Enter any number between 1 and 100 : ");
			int num = scan.nextInt();
			if (num % 2 > 0) {
				if (num > 60) {
					System.out.printf("%s is Odd and over 60", num);
				} else {
					System.out.printf("number %d is a odd number %n", num);
				}
			} else if (num % 2 == 0 && num >= 2 && num < 25) {
				System.out.printf("number %d is a even number %n and less than 25", num);
			} else if (num >= 26 && num <= 60) {
				System.out.printf("Even");
			} else if (num > 60) {
				System.out.printf("Number %d is even", num);
			} 
			
			System.out.println("\nWould you like to continue (Y/N)");
			cont = scan.next();
		}
		System.out.println("Goodbye");
		scan.close();
	}
}
