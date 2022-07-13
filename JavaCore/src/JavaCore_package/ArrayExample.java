package JavaCore_package;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[]arr=new int[3];
       arr[0]=9;
       arr[1]=5;
       arr[2]=6;
       
       int min=arr[0];
       for(int i=1; i<arr.length; i++)
       {
    	   if(min>arr[1])
    		   min=arr[i];
       }
       System.out.println("the lowest value is "+min);
	}

}
