package pro5;

public class Trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = null;
try {
	str.equals("hello");
	}
catch(NullPointerException ne) {
	str=new String("hello");
	System.out.println(str.equals("hello"));
}
System.out.println("counting");
	}

}
