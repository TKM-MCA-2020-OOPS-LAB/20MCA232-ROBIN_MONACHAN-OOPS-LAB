package javaprg;
import java.util.Scanner;

public class details {
int eNo;
String eName;
int salary;
details(int a, String b,int c) {

	eNo=a;
	eName=b;
	salary=c;

  }
public void display(int p)
{
if(p==eNo) {
System.out.println("Employee number :=> "  + eNo + "\t"+ " Employee Name :=> " +eName + "\t"+ "Salary :=> " +salary);

}
}

public static void main(String[] args)
{  int a;
   int b;
   int s;
   String c;
	Scanner obq=new Scanner(System.in);
	Scanner obq1=new Scanner(System.in);
	System.out.println("Enter the number of employee :");
	a=obq.nextInt();
	details[] obj=new details[a];
	for(int i=0;i<a;i++)
	{	
		System.out.println("Enter the employee N.O :");
		b=obq.nextInt();
		System.out.println("Enter the employee Name :");
		c=obq1.nextLine();
		System.out.println("Enter the employee Salary :");
		s=obq.nextInt();
		obj[i]=new details(b,c,s);
	}
	System.out.println("Enter the emp number :");
	int t=obq.nextInt();
	for(int j=0;j<a;j++)
	{
		obj[j].display(t);
	}
	
	
}
}
