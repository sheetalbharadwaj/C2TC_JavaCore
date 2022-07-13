package LAMDA;
interface Statement {
	public String greet();
}
public class LamdaNP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Statement s= ()->{return "Hello World.";};
System.out.println(s.greet());
	}

}
