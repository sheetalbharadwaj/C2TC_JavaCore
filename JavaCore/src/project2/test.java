package project2;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String n= sc.nextLine();
		System.out.println("enter student id");
		int i= sc.nextInt();
		System.out.println("total marks for 100");
		int mc=sc.nextInt();
		System.out.println("Name: "+n+" ID: "+i+" Total Marks: "+mc);
		
		//character input
		char c = sc.next().charAt(0);
		
		//print the read value
		System.out.println("c= "+c);
	}

}
