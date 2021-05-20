package javaprg;
import java.util.Scanner;

class  employees{
	int b;
	 String c;
	 String a;
	 int s;
	public employees() {
		 
		Scanner obq=new Scanner(System.in);
		Scanner obq1=new Scanner(System.in);Scanner obq2=new Scanner(System.in);
		
		System.out.println("Enter the employee N.O :");
		b=obq.nextInt();
		System.out.println("Enter the employee Name :");
		c=obq1.nextLine();
		System.out.println("Enter the employee Address :");
		a=obq2.nextLine();
		System.out.println("Enter the employee salary:");
		s=obq.nextInt();
	}
	public void edisplay() {
		System.out.println("Employee N.O :"+b);

		System.out.println("Employee Name :"+c);

		System.out.println("Employee Address :"+a);

		System.out.println("Employee salary:"+s);
		
	}
	
}

class teachers extends employees {
	 String c,a;
	public teachers() {
	   

		Scanner obq1=new Scanner(System.in);
		Scanner obq2=new Scanner(System.in);
			
		System.out.println("Enter the employee deparment :");
		c=obq1.nextLine();
		System.out.println("Enter the employee subject :");
		a=obq2.nextLine();
	
		
	}
	
	void tdisplay() {
		System.out.println("Employee deparment :"+c);
		
		System.out.println("Employee subject :"+a);
	
	
	}
	
	
}
class data extends teachers{
	public data() {
		
	}
	
	public void display(int i) {
		System.out.println("\n"+"----------"+i+"st Employee ---------"+"\n");
		tdisplay();
		edisplay();
	}
}

public class  employee{
	
	public static void main(String[] args) {
		int a;
		Scanner obq=new Scanner(System.in);
		System.out.println("Enter the number of employee :");
		a=obq.nextInt();
		data[] obj=new data[a];
		for(int i=0;i<a;i++)
		{	
			
			obj[i]=new data();
		}
		for(int i=0;i<a;i++)
		{	
			
			obj[i].display(i+1);
		}
	    
	}
	
}
