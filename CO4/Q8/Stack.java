package javaprg;
import java.util.*;
public class Stack {
	int top=-1,ch,item,i;
	int a[] = new int[10];
    Scanner sc = new Scanner(System.in);
    
	public static void main(String[] args) {
		Stack st = new Stack ();
		st.stack();
		}

	public void stack(){
		    System.out.println("Enter the size of the stack:");
			int N=sc.nextInt();
			do
			{
				
	        System.out.println("\nEnter your choice ");
		    System.out.println("\n 1.Push \n 2.Pop \n 3.Display \n");
		    ch=sc.nextInt();
		switch(ch){
		case 1:
			System.out.println("Enter the element to be inserted:");
			item=sc.nextInt();
			if(top==N-1) {
				System.out.println("Stack overflow!");
			}
			else {
				top++;
				a[top]=item;
			}
			break;
		case 2:
			if(top==-1) {
				System.out.println("Stack is empty!!");
			}
			else {
				item=a[top];
				top--;
				System.out.println("Deleted element is:" +item);
			}
		    break;
		case 3:
		    if(top==-1)
		    {
		    	System.out.println("Stack is empty!!");
		    }
		    else
		    {
		    	System.out.println("Displaying  elements in the Stack:\n");
		    	for(int i=top;i>=0;i--)
		    	{
		    		System.out.println(a[i]);
		    	}
		    }
		    break;
		    
	case 4: System.out.println("Enter a valid choice");
	    }
		}
		while(ch!=5);
	}
}