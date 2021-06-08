package Arithmetic;

interface arith {
public void add();
public void sub();
public void mult();
public void div();
}
 public class Operation implements arith{
	
	int x,y;
	public void data(int a,int b) {
		x=a;
		y=b;
	}
	public void add() {
		int s;
		s=x+y;
		System.out.println("Addition :"+s);
	}
	public void sub() {
		int m;
		m=x-y;
		System.out.println("Subtration :"+m);
	}
	public void mult() {
		int p;
		p=x*y;
		System.out.println("Multiplication :"+p);
	}
	public void div() {
		float d;
		d=x/y;
		System.out.println("Division :"+d);
	}
}