package javaprg;
import java.util.Scanner;
import java.lang.*;
import java.io.*;
public class mult {
	public static void main(String[] args) throws InterruptedException    {
		multiplication_tbl a = new multiplication_tbl();
		prime_num b = new prime_num();
		a.start();
		a.sleep(200);
		b.start();
		b.sleep(200);
		
   }
}

class multiplication_tbl extends Thread{
	public void run(){
    int n=10;
	Scanner sc= new Scanner(System.in);
	System.out.println("Multiplication of Five");
	     for(int i=1;i<=10;i++)
        {
            System.out.println(+i+"x 5 =>"+(i*5));
        }
	 }
}

class prime_num extends Thread{
	public void run() {
	   int n,i=3,count,m;
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter limit for prime numbers:");
	    n=sc.nextInt();
	    
	    if(n >=1)
	    {
	    	System.out.println("First prime"  +n+  "numbers are:");
	    	System.out.println("2");
	    	for(count = 2; count <= n; i++)  
	        {
	           
	            for(m= 2; m < i;m++)
	            {
	                if(i%m == 0)
	                    break;
	            }

	            if(m== i)  
	            {
	            	System.out.println(i);
	                count++;    
	            }
	        }
	    }  
	}
}