package TestPK;
import Arithmetic.Operation;
import Graphics.Dimension;

import java.util.Scanner;

public class oper {
public static void main(String[] args) {
	Operation obj=new Operation();
	Scanner obk=new Scanner(System.in);
    System.out.println("Enter the 1st number");
    int a=obk.nextInt();
    System.out.println("Enter the 2st number");
    int b=obk.nextInt();
    int ch=0;
	obj.data(a, b);
	//l=obj1.nextInt();

	while(ch<5) {
		System.out.println("Choose the Operation :"+"\n 1.Addition \t 2.Subtration \n 3.Multiplication \t 4.Division \t 5.Exit");
		ch=obk.nextInt();
	switch(ch) {
	
	case 1: 
			obj.add();
	        break;
    case 2: 
    	    obj.sub(); 
    	    break;
    case 3: 
    	    obj.mult();
    	    break;
    case 4: 
    	    obj.div();
    	    break;
    case 5: break;
      default:
      System.out.println("invalid choice");
      break; 
	
	}
	}
	}
}
