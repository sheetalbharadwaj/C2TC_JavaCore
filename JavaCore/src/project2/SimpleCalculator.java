package project2;

public class SimpleCalculator {
	void prnsqr(int i)
	{
		System.out.println("square of int "+i+" is "+i*i);
	}
	void prnsqr(int f) {
		System.out.println("square of float"+f+" is "+ f*f);
	}
	void prnsqr(char c) {
		System.out.println(c+" is a character");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleCalculator ob=new SimpleCalculator();
		System.out.println(ob.prnsqr(5));
		System.out.println(ob.prnsqr('a'));
		System.out.println(ob.prnsqr(3.4));
	}

}
