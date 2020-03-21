package makechange;

public class TestingSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		In addition to println(), System.out provides the printf() method to print formatted strings.
////
//		int i = 17;
//		System.out.printf("%d in hexadecimal is %x.%n", i, i);
////		// 17 in hexadecimal is 11.
////		printf() takes a format string and a variable list of arguments (an example of a varargs method.)
////
////		The format string contains literal text, as well as format specifiers that start with %.
////
////		Each parameter after the format string is substituted into the corresponding format specifier for output.
////
////		The letter in the format specifier tells printf() how to convert the value for printing:
////
////		d - as a decimal integer
////		o - as an octal integer
////		x - as a hexadecimal integer
////		f - as a floating-point number
////		a - as a floating-point number in hexadecimal
////		s - as a string
////		Other special format specifiers include:
////
////		%n - a newline: unlike println(), printf() doesn't output a newline unless you tell it to.
////		%% - a literal %.
//
//		double x = 17.98;
//		System.out.printf("%.2f", x);
		
		
		int price = 50, payment = 64;
		double change = payment - price;
		int wholeDollars = (int)(change); //casting double to int to get whole dollars
		
		
		if (wholeDollars / 20 >= 1) {
			int bills20 = wholeDollars / 20;
			System.out.println("I will give you " + bills20 + " twenty dollar bill(s).");
		}
		else if (wholeDollars / 10 >= 1 ) {
			if (wholeDollars % 10 == 0) {
			int bills10 = wholeDollars / 10;
			System.out.println("I will give you " + bills10 + " ten dollar bill(s).");
			}
			else {
				
			}
		}
		else if (wholeDollars / 5 >= 1 ) {
			int bills5 = wholeDollars / 5;
			System.out.println("I will give you " + bills5 + " five dollar bill(s).");
		}
		else if (wholeDollars / 1 >= 1) {
			int bills1 = wholeDollars / 1;
			System.out.println("I will give you " + bills1 + " one dollar bill(s).");
		}
		else {
			System.out.println("No bills for you.");
		}
		
		
		
	}

}
