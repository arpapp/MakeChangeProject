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
			int wholeDollars = (int) (change); // casting double to int to get whole dollars
			double cents = change - wholeDollars; //getting cents

			if (wholeDollars / 20 >= 1) {
				int bills20 = wholeDollars / 20;
				int remainder = wholeDollars % 20;
				System.out.println("I will give you " + bills20 + " twenty dollar bill(s)");

				if (remainder / 10 >= 1) {
					int bills10 = remainder / 10;
					int remainder2 = remainder % 10;
					System.out.println("I will give you " + bills10 + " ten dollar bill(s).");

					if (remainder2 / 5 >= 1) {
						int bills5 = remainder2 / 5;
						int remainder3 = remainder2 % 5;
						System.out.println("I will give you " + bills5 + " five dollar bill(s).");

						if (remainder3 >= 1) {
							int bills1 = remainder3 / 1;
							System.out.println("I will give you " + bills1 + " one dollar bill(s)");
						}
					}
					else if (remainder2 >= 1) {
						int bills1 = remainder2 /1;
						System.out.println("I will give you " + bills1 + " one dollar bill(s).");
					}
				}
				else if (remainder / 5 >= 1) {
					int bills5 = remainder / 5;
					int remainder2 = remainder % 5;
					System.out.println("I will give you " + bills5 + " five dollar bill(s).");
					
					if (remainder2 / 1 >= 1) {
						int bills1 = remainder2 / 1;
						System.out.println("I will give you " + bills1 + " one dollar bill(s). ");
					}
				}
			} else if (wholeDollars / 10 >= 1) {
				int bills10 = wholeDollars / 10;
				int remainder = wholeDollars % 10;
				System.out.println("I will give you " + bills10 + " ten dollar bill(s).");

				if (remainder / 5 >= 1) {
					int bills5 = remainder / 5;
					int remainder2 = remainder % 5;
					System.out.println("I will give you " + bills5 + " five dollar bill(s).");

					if (remainder2 >= 1) {
						int bills1 = remainder2 / 1;
						System.out.println("I will give you " + bills1 + " one dollar bill(s)");
					}

				}
				else if (remainder / 1 >= 1) {
					int bills1 = remainder / 1;
					System.out.println("I will give you " + bills1 + " one dollar bill(s). ");
				}
			} else if (wholeDollars / 5 >= 1) {
					int bills5 = wholeDollars / 5;
					int remainder = wholeDollars % 5;
					System.out.println("I will give you " + bills5 + " five dollar bill(s).");

					if (remainder >= 1) {
						int bills1 = remainder / 1;
						System.out.println("I will give you " + bills1 + " one dollar bill(s)");
					}
			} else if (wholeDollars / 1 >= 1) {
				int bills1 = wholeDollars / 1;
				System.out.println("I will give you " + bills1 + " one dollar bill(s).");
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
			}
			while (cents / 10 >= 1) {
				dimes = cents / 10;
				numDimes = (int) (dimes);
				cents = cents - (numDimes * 10);
			}
			while (cents / 5 >= 1) {
				 nickels = cents / 5;
				numNickels = (int) (nickels);
				 cents = cents - (numNickels * 5);
			}
			while (cents / 1 >= 1) {
				pennies = (cents / 1) + 0.005;
			    numPennies = (int) (pennies);
				cents = cents - numPennies;
			}
			System.out.println("I will give you " + numQuarters + " quarters, " + numDimes + " dimes, " 
					+ numNickels + " nickels, and " + numPennies + " pennies.");
			
		}
			
	}
}







