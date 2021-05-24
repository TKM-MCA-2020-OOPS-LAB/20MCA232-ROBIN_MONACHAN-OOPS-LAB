package TestPK;

import java.util.Scanner;


class person{
	
	String x,y,z;
	int v;
	
	public person() {
		 
		Scanner obq=new Scanner(System.in);
		Scanner obq1=new Scanner(System.in);Scanner obq2=new Scanner(System.in);
		Scanner obq3=new Scanner(System.in);
		
		System.out.println("Enter the  Name :");
		x=obq1.nextLine();
		System.out.println("Enter the Gender :");
		y=obq2.nextLine();
		System.out.println("Enter the Address :");
		z=obq3.nextLine();
		System.out.println("Enter the employee Age:");
		v=obq.nextInt();
	}
	
}

class  employees extends person {
	int b;
	 String c;
	 String a;
	 int s;
	public employees() {
		 
		Scanner obq=new Scanner(System.in);
		Scanner obq1=new Scanner(System.in);Scanner obq2=new Scanner(System.in);
		
		System.out.println("Enter the employee Id :");
		b=obq.nextInt();
		System.out.println("Enter the employee Company Name :");
		c=obq1.nextLine();
		System.out.println("Enter the employee Qualification :");
		a=obq2.nextLine();
		System.out.println("Enter the employee salary:");
		s=obq.nextInt();
	}

	
}

class teachers extends employees {
	 String c,a;
	 int p;
	public teachers() {
	   

		Scanner obq1=new Scanner(System.in);
		Scanner obq2=new Scanner(System.in);
		Scanner obq3=new Scanner(System.in);
			
		System.out.println("Enter the  Deparment :");
		c=obq1.nextLine();
		System.out.println("Enter the Subject :");
		a=obq2.nextLine();
		System.out.println("Enter the Teacher Id :");
		p=obq3.nextInt();
	    
		
	}
	
	public void tdisplay() {
		


		System.out.println("Deparment :"+c);
		
		System.out.println("Subject :"+a);
		
		System.out.println("Teacher Id :"+p);
	
	
	}
	
	
}

class data extends teachers{
	public data() {
		
	}
	
	public void display(int i) {
		System.out.println("\n"+"----------"+i+"st Employee ---------"+"\n");
		tdisplay();
		
	}
}


public class  corp{
	
	public static void main(String[] args) {
		int a;
		Scanner obq=new Scanner(System.in);
		System.out.println("Enter the number of Person to be added :");
		a=obq.nextInt();
		data[] obj=new data[a];
		for(int i=0;i<a;i++)
		{	
			
			obj[i]=new data();
		}
		for(int j=0;j<a;j++)
		{	
			
			obj[j].display(j+1);
		}
	    
	}
	
}
