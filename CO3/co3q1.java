package javaprg;
import java.util.Scanner;
public class shapes {
	public void area(int l,int b) {
		System.out.println("Area of reactangle is:"+l*b);
	}
	
	public void area(float r)
	{
		System.out.println("Area of circle is:"+3.14*r*r);
	}
	
	public static void main(String[] args) {
		int l,b;
		float r;
		Scanner obk=new Scanner(System.in);
		shapes obj=new shapes();
		System.out.println("Enter the length and breadth of reactangle:");
		l=obk.nextInt();
		b=obk.nextInt();
		System.out.println("Enter the radius of the circle:");
		r=obk.nextInt();
		obj.area(l,b);
		obj.area(r);
		
	}

}
