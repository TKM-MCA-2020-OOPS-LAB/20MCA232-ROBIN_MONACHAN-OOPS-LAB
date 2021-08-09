package TestPK;

import java.util.*;

public class stack {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i,n;
		System.out.println("Enter the number to be added:");
		int a=s.nextInt();
		Stack <Integer> st = new Stack<Integer>();
		for(i=0;i<=a;i++) {
		System.out.println("Enter the "+(i+1)+"st number:");
		n=s.nextInt();
		st.add(n);
		}
		System.out.println("Original Stack:"+st);
		
		System.out.println("\nEnter the index to be removed:");
		int index = s.nextInt();
		
		int rm_ele = st.remove(index);
		
		System.out.println("Removed Element is:"+rm_ele);
		
		System.out.println("\nStack after updation:\n"+st);
		

	}

}
