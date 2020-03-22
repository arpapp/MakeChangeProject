package makechange;

public class TestingSpace {

	static java.util.Scanner kb = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		double price, payment, change, bills20 = 0, bills10 = 0, bills5 = 0, bills1 = 0, quarters = 0, nickels = 0, dimes = 0, pennies = 0;

		System.out.println("Enter the total price: ");
		price = kb.nextDouble();
		System.out.println("Enter your payment: ");
		payment = kb.nextDouble();

		if (price == payment) {
			System.out.println(
					"Thank you for the exact change. Where were you when I was working Christmas at Toys R Us?");
		} else if (payment < price) {
			System.out.println("I'm sorry, that's not enough.");
		} else {
			change = payment - price;
			int wholeDollars = (int) (change); // casting double to int to get whole dollars
			double cents = change - wholeDollars;
			while (wholeDollars >= 20) {
				bills20 = bills20 + 1;
				wholeDollars = wholeDollars - 20;
				} 
			while (wholeDollars >= 10 ) {
				bills10 = bills10 + 1;
				wholeDollars = wholeDollars - 10;
			}
			while (wholeDollars >= 5) {
				bills5 = bills5 + 1;
				wholeDollars = wholeDollars - 5;
			}
			while (wholeDollars >= 1) {
				bills1 = bills1 + 1;
				wholeDollars = wholeDollars - 1;
			}
					
			while (cents >= 0.25) {
				quarters = quarters + 1;
				cents = cents - 0.25;
			}
			while (cents >= 0.1) {
				dimes = dimes + 1;
				cents = cents - 0.1;
			}
			while (cents >= 0.05) {
				nickels = nickels + 1;
				cents = cents - 0.5;
			}
			while (cents >= 0.01) {
				pennies = pennies + 1;
				cents = cents - 0.01;
			}
			System.out.println("You get " + bills20 + " twenties " + bills10 + " tens " + bills5 + " fives and " + bills1 + " ones.");
			System.out.println("You get " + quarters + " quarters " + dimes + " dimes " + nickels + " nickels and " + pennies + " pennies.");
			
			
			
			
			
			
			
			
		}

	}
	
}


