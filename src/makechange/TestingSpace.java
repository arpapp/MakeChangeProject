package makechange;

public class TestingSpace {

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
			
			while (cents / 25 >= 1) {
				quarters = cents / 25;
				int numQuarters = (int) (quarters);
				cents = cents - (numQuarters * 25);
			}
			while (cents / 10 >= 1) {
				dimes = cents / 10;
				int numDimes = (int) (dimes);
				cents = cents - (numDimes * 10);
			}
			while (cents / 5 >= 1) {
				 nickels = cents / 5;
				 int numNickels = (int) (nickels);
				 cents = cents - (numNickels * 5);
			}
			while (cents / 1 >= 1) {
				pennies = cents / 1;
				int numPennies = (int) (pennies);
				cents = cents - numPennies;
			}
			System.out.println("I will give you " + Math.round(quarters) + " quarters, " + Math.round(dimes) + " dimes, " 
			+ Math.round(nickels) + " nickels, and " + Math.round(pennies) + " pennies.");
			
		}

	}
}





//if (cents % 0.25 == 0) {
//double quarters = cents / 0.25;
//System.out.println("I will give you " + quarters + " quarters.");
//}
//else if (cents % 0.10 == 0) {
//double dimes = cents / 0.10;
//System.out.println("I will give you " + dimes + " dimes.");
//}
//else if (cents % 0.5 == 0) {
//double nickels = cents / 0.05;
//System.out.println("I will give you " + nickels + " nickels.");
//}
//else if (cents % 0.01 == 0) {
//double pennies = cents / 0.01;
//System.out.println("I will give you " + pennies + " pennies.");
//}
//else {
//System.out.println("No coins for you.");
//}







//COINS DOWN HERE

//			double coins = change - wholeDollars; //trying to get change
//			
//			if (coins % 0.25 == 0) {
//				double quarters = coins / 25;
//				System.out.println("I will give you " + quarters + "twenty dollar bills.");
//			}
//			else if (coins % 0.10 == 0) {
//				double dimes = coins / 10;
//				System.out.println("I will give you " + dimes + "twenty dollar bills.");
//			}
//			else if (coins % 0.5 == 0) {
//				double nickels = coins / 5;
//				System.out.println("I will give you " + nickels + "twenty dollar bills.");
//			}
//			else if (coins % 0.01 == 0) {
//				double pennies = coins / 1;
//				System.out.println("I will give you " + pennies + "twenty dollar bills.");
//			}
//			else {
//				System.out.println("No coins for you.");
//			}
//		
//		}
//		
//	}
//
//}

//System.out.printf("Your change is %.2f . Here is coins.", change);

//public static double makeChange(double price, double payment) {
//	double change;
//	
//	change = price - payment;
//	return change;
//}

//double x = 17.98;
//System.out.printf("%.2f", x);




//Coins down here

//double quarters = 0;
//double dimes = 0;
//double nickels = 0;
//double pennies = 0;
//
//cents = cents * 100;
//
//while (cents / 25 >= 1) {
//	quarters = cents / 25;
//	int numQuarters = (int) (quarters);
//	cents = cents - (numQuarters * 25);
//}
//while (cents / 10 >= 1) {
//	dimes = cents / 10;
//	int numDimes = (int) (dimes);
//	cents = cents - (numDimes * 10);
//}
//while (cents / 5 >= 1) {
//	 nickels = cents / 5;
//	 int numNickels = (int) (nickels);
//	 cents = cents - (numNickels * 5);
//}
//while (cents / 1 >= 1) {
//	pennies = cents / 1;
//	int numPennies = (int) (pennies);
//	cents = cents - numPennies;
//}
//System.out.println("I will give you " + Math.round(quarters) + " quarters, " + Math.round(dimes) + " dimes, " 
//+ Math.round(nickels) + " nickels, and " + Math.round(pennies) + " pennies.");
//
//}
//
//}
//}




