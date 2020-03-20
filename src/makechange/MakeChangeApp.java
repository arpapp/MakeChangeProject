package makechange;

public class MakeChangeApp {

static java.util.Scanner kb = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		double price, payment;

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
			System.out.println(makeChange(price, payment));
		}

	}
	
	public static double makeChange(double price, double payment) {
		double change;
		
		change = price - payment;
		return change;
	}

}
