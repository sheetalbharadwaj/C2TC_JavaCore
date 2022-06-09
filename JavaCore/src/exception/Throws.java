package exception;
import java.io.IOException;
public class Throws {
static void display()throws IOException
{
	System.out.println("hello java");
	throw new IOException();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Throws obj= new Throws();
try 
{
	obj.display();
}
catch(IOException e) 
{
	System.out.println("caught an exception:\n"+e);
}
	}


	}


