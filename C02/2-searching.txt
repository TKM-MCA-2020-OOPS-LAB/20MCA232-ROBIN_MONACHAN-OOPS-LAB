package TestPK;

import java.util.Scanner;

public class searchelement {

	public void data(int[] namess, int a) {
	     int count=0;
		for(int i=0;i<5;i++) {
			if(namess[i]==a) {
				count+=1;
			}
		}
		if(count>0)
		{
				
			System.out.println("The number "+a+" present "+count+" times");
		}
		else {
			System.out.println("The number "+a+" is not present");				
		}
		
	
}
	public static void main(String[] args) {
		int a;
		searchelement s =new searchelement();
		int[] elements=new int[] {1,3,3,4,5};
		
		Scanner obk =new Scanner(System.in);
		System.out.println("Enter element to search");
		a=obk.nextInt();
		s.data(elements,a);
	}
}