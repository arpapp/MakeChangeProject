package makechange;

public class MakeChangeApp {

	static java.util.Scanner kb = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		double price, payment, change;
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
			
			System.out.printf("Your change is $%.2f.%n", change);
			
			int wholeDollars = (int) (change); // casting double to int to get whole dollars
			double cents = change - wholeDollars; //getting cents

			int bills20 = 0;
			int bills10 = 0;
			int bills5 = 0;
			int bills1 = 0;
			
			while (wholeDollars / 20 >= 1) {
				bills20 = wholeDollars / 20;
				wholeDollars = wholeDollars - (bills20 * 20);
				System.out.println("I will give you " + bills20 + " twenty dollar bill(s)");
				}
			while (wholeDollars / 10 >= 1) {
				bills10 = wholeDollars / 10;
				wholeDollars = wholeDollars - (bills10 * 10);
				System.out.println("I will give you " + bills10 + " ten dollar bills(.)");
			}
			while (wholeDollars / 5 >=1) {
				bills5 = wholeDollars / 5;
				wholeDollars = wholeDollars - (bills5 * 5);
				System.out.println("I will give you " + bills5 + " five dollar bills(.)");
			}
			while (wholeDollars / 1 >= 1) {
				bills1 = wholeDollars / 1;
				wholeDollars = wholeDollars - bills1;
				System.out.println("I will give you " + bills1 + " one dollar bills(.)");
			}
					
			
			
			//Coins down here
			
			double quarters = 0;
			double dimes = 0;
			double nickels = 0;
			double pennies = 0;
			
			cents = cents * 100;
			
			int numQuarters = 0, numDimes = 0, numNickels = 0, numPennies = 0;
			
			while (cents / 25 >= 1) {
				quarters = cents / 25;
				numQuarters = (int) (quarters);
				cents = cents - (numQuarters * 25);
				System.out.println("I will give you " + numQuarters + " quarter(s).");
			}
			while (cents / 10 >= 1) {
				dimes = cents / 10;
				numDimes = (int) (dimes);
				cents = cents - (numDimes * 10);
				System.out.println("I will give you " + numDimes + " dime(s).");
			}
			while (cents / 5 >= 1) {
				 nickels = cents / 5;
				numNickels = (int) (nickels);
				 cents = cents - (numNickels * 5);
				 System.out.println("I will give you " + numNickels + " nickel(s).");
			}
			while (cents / 1 >= 0.009) {
				pennies = (cents / 1) + 0.005;
			    numPennies = (int) (pennies);
				cents = cents - numPennies;
				System.out.println("I will give you " + numPennies + " penny(ies).");
			}
			
		}
			
	}
}







