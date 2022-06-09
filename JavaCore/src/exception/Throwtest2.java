package exception;

public class Throwtest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=20;
int y=0;
try
{
	int z=x/y;
	System.out.println("Result:"+z);
	//ArithmeticException a= new ArithmeticException("hello from throw");
	//throw a ;
	throw new ArithmeticException();
}
catch(ArithmeticException ae) {
	System.out.println("ArithmeticException caught:\n"+ae);
}

	}
}

