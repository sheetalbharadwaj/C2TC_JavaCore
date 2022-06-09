package pro5;

public class Withoutexception {
public static void main(String[] args) {
	int d=0,a;
	try {
		a=42/d;
		System.out.println("not printed");
	}
	catch(ArithmeticException e) {
		System.out.println("division by zero");
	}
	System.out.println("will not respond");
}
}
