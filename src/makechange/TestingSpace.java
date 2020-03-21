package makechange;

public class TestingSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		In addition to println(), System.out provides the printf() method to print formatted strings.
//
		int i = 17;
		System.out.printf("%d in hexadecimal is %x.%n", i, i);
//		// 17 in hexadecimal is 11.
//		printf() takes a format string and a variable list of arguments (an example of a varargs method.)
//
//		The format string contains literal text, as well as format specifiers that start with %.
//
//		Each parameter after the format string is substituted into the corresponding format specifier for output.
//
//		The letter in the format specifier tells printf() how to convert the value for printing:
//
//		d - as a decimal integer
//		o - as an octal integer
//		x - as a hexadecimal integer
//		f - as a floating-point number
//		a - as a floating-point number in hexadecimal
//		s - as a string
//		Other special format specifiers include:
//
//		%n - a newline: unlike println(), printf() doesn't output a newline unless you tell it to.
//		%% - a literal %.

		double x = 17.98;
		System.out.printf("%.2f", x);
		
	}

}
