package javaprg;

import java.util.Scanner;

class publisher {
	String p_name;
	int p_year;
	Scanner sc=new Scanner(System.in);
	
	publisher()
	{
		System.out.println("Enter Publisher name");
		p_name=sc.next();
		System.out.println("Enter the Year of Publication");
		p_year=sc.nextInt();
	}
}

class book extends publisher {
	String b_name,b_author;
	int b_price;
	Scanner sc=new Scanner(System.in);
	
	book() {
		System.out.println("Enter Book name");
		b_name=sc.next();
		System.out.println("Enter author");
		b_author=sc.next();
		System.out.println("Enter price");
		b_price=sc.nextInt();
	}
}

class literature extends book {
	int page;
	Scanner sc=new Scanner(System.in);
	
	literature() {
		System.out.println("Enter number of pages: ");
		page=sc.nextInt();
	}
	void display(int i)
	{
		System.out.println("........"+i+"st LITERATURE ........");
		System.out.println("Publisher name is "+p_name);
		System.out.println("Published year is "+p_year);
		System.out.println("Book name is "+b_name);
		System.out.println("Autho name is "+b_author);
		System.out.println("Price is "+b_price);
		
	}
}


class fictions extends book {
	int page;
	Scanner sc=new Scanner(System.in);
	
	fictions() {
		System.out.println("Enter number of pages");
		page=sc.nextInt();
	}
	void display(int i)
	{
		System.out.println("......... "+i+"st FICTION BOOK .........");
		System.out.println("Publisher name is "+p_name);
		System.out.println("Published year is "+p_year);
		System.out.println("Book name is "+b_name);
		System.out.println("Autho name is "+b_author);
		System.out.println("Price is "+b_price);
		
	}
}
public class inheritance {

	public static void main(String[] args) {
		int n,m,c,choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Choices");
		System.out.println("1.literature.");
		  System.out.println("2.fiction.");
		  System.out.println("Enter the choice:");
		  choice=sc.nextInt();
		  switch(choice)
		  {
		  case 1: 
		         System.out.println("Enter number of literatures books");
		         n=sc.nextInt();
		         literature l[]=new literature[n];
		         for(int i=0;i<n;i++) {
			     l[i]=new literature();
		         }
		         
		         for(int i=0;i<n;i++) {
						l[i].display(i+1);
					}
		         
		         break;
		  
		  case 2:
		         System.out.println("Enter number of fictions books");
		         m=sc.nextInt();
		         fictions f[]=new fictions[m];
	           	 for(int i=0;i<m;i++) {
			     f[i]=new fictions();
		         }
	           	 
	           	for(int i=0;i<m;i++) {
					f[i].display(i+1);
		    }
	           	 
	           	 break;
		 default:
		      System.out.println("invalid choice");
		      break;  
		  }
		
  }
}
