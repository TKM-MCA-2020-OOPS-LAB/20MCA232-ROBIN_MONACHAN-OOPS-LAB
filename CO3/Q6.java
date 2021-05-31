package javaprg;

import java.util.Scanner;

interface process{
	void data();
	void area();
	void premeter();
}
class Circle implements process{
	float r;
	double area1,premeter1;
	public void data()
	{
		Scanner obj=new Scanner(System.in);
	

		System.out.println("Enter The radius Circle");
		r=obj.nextInt();
		
		
	   
	}
	
	public void  area() {
		area1=3.14*r*r;
		System.out.println("Area:"+area1);
	}
	public void premeter() {
		premeter1=2*3.14*r;
		   System.out.println("Premeter:"+premeter1);
		
}
	
}

class Rectangle implements process{
	int l,b,area1,premeter1;
	public void data()
	{
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter The Length of Rectangle");
		 l=obj.nextInt();
		System.out.println("Enter The Breadth of Rectangle");
		 b=obj.nextInt();
		//area1=l*b;
		//premeter1=2*(l+b);
	}
	
	public void  area() {
		area1=l*b;
		System.out.println("Area of Rectangle:"+area1);
		
	}
	public void premeter() {
		premeter1=2*(l+b);
		System.out.println("Premeter of Rectangle:"+premeter1);
	}
}
public class diamension {
	public static void main(String[] args) {
		
	
	
	Rectangle obj1=new Rectangle();
	Circle obj2=new Circle();
	int r;
	
	obj2.data();
	obj2.area();
	obj2.premeter();
	obj1.data();
	obj1.area();
	obj1.premeter();
	}

}
