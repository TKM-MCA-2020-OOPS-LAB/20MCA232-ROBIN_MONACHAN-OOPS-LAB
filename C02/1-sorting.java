package TestPK;
import java.util.Arrays;
import java.util.Scanner;

public class sorting {
	
public void data(String[] namess)
{  
   Arrays.sort(namess);
   System.out.println(Arrays.toString(namess));
}
public static void main(String[] args) {
	
	sorting s =new sorting();
	String[] cont=new String[3];
	Scanner obk =new Scanner(System.in);
	System.out.println("Enter any 5 names:");
	for(int i=0;i<3;i++)
	{
		cont[i]=obk.nextLine();
	}
	
	s.data(cont);
	
}
}