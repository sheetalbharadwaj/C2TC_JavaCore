package testpk;

public class SimpleCalculator2 {

	int add(int a, int b)
	{
	return a+b;
	}
	int add(int a, int b, int c)
	{
	return a+b+c;
	}
	}
	public class Demo
	{
	public static void main(String args[])
	{
	SimpleCalculator2 obj = new SimpleCalculator2();
	System.out.println(obj.add(25, 25));
	System.out.println(obj.add(25, 25, 30));
	}
	}
	
