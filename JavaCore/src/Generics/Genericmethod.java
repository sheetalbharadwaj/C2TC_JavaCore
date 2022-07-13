package Generics;

public class Genericmethod {
public<T>void methodgen(T var1)
{
	System.out.println("the value is passed is of type"
			+ var1.getClass().getSimpleName());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Genericmethod ob= new Genericmethod();
ob.<String>methodgen("is the best");
ob.methodgen("learning java");
ob.methodgen(154);
	}

}
