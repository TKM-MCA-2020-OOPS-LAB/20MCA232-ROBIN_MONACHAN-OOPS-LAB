package TestPK;
import java.util.Scanner;
import Graphics.Dimension;

public class Test {

	public static void main(String[] args) {
		Scanner obk=new Scanner(System.in);
		Dimension obj=new Dimension();
		int ch=0;
		
		//l=obj1.nextInt();
	
		while(ch<5) {
			System.out.println("Choose the Shape to find the area:"+"\n 1.Rectangle \t 2.Triangle \n 3.Circle \t 4.Sqaure \t 5.Exit");
			ch=obk.nextInt();
		switch(ch) {
		
		case 1: 
				obj.rectangle();
		        break;
	    case 2: 
	    	    obj.triangle(); 
	    	    break;
	    case 3: 
	    	    obj.circle();
	    	    break;
	    case 4: 
	    	    obj.square();
	    	    break;
	    case 5: break;
	      default:
	      System.out.println("invalid choice");
	      break; 
		
		}
		}
	}
}
