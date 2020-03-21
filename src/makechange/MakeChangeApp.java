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
			System.out.println("Thank you for the exact change. Where were you when I was working Christmas at Toys R Us?");
		} else if (payment < price) {
			System.out.println("I'm sorry, that's not enough.");
		} else {
			change = price - payment;
				int wholeDollars = (int)(change); //casting double to int to get whole dollars
				
				if (wholeDollars % 20 == 0) {
					int bills20 = wholeDollars / 20;
					System.out.println("I will give you " + bills20 + "twenty dollar bills.");
				}
				else if (wholeDollars % 10 == 0 ) {
					int bills10 = wholeDollars / 10;
					System.out.println("I will give you " + bills10 + "ten dollar bills.");
				}
				else if (wholeDollars % 5 == 0 ) {
					int bills5 = wholeDollars / 5;
					System.out.println("I will give you " + bills5 + "five dollar bills.");
				}
				else if (wholeDollars % 1 == 0) {
					int bills1 = wholeDollars / 1;
					System.out.println("I will give you " + bills1 + "one dollar bills.");
				}
				else {
					System.out.println("No bills for you.");
				}
				
				double coins = change - wholeDollars;
				
				if (coins % 0.25 == 0) {
					double quarters = coins / 25;
					System.out.println("I will give you " + quarters + "twenty dollar bills.");
				}
				else if (coins % 0.10 == 0) {
					double dimes = coins / 10;
					System.out.println("I will give you " + dimes + "twenty dollar bills.");
				}
				else if (coins % 0.5 == 0) {
					double nickels = coins / 5;
					System.out.println("I will give you " + nickels + "twenty dollar bills.");
				}
				else if (coins % 0.01 == 0) {
					double pennies = coins / 1;
					System.out.println("I will give you " + pennies + "twenty dollar bills.");
				}
				else {
					System.out.println("No coins for you.");
				}
			
			}
			
		}

	}

	
//System.out.printf("Your change is %.2f . Here is coins.", change);

//	public static double makeChange(double price, double payment) {
//		double change;
//		
//		change = price - payment;
//		return change;
//	}



//double x = 17.98;
//System.out.printf("%.2f", x);

