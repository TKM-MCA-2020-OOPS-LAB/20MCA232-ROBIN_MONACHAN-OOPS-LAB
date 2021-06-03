package javaprg;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 

interface billing{
	public void product();
	public int calculation();
	//public void display();
}

class section implements billing{
	int prdtid,orderid,quanity,price,total;
	String prdtname;
	int pprice;
	Scanner obj1=new Scanner(System.in);
	
	public void product() {
		System.out.println("Enter the Product Id");
		prdtid=obj1.nextInt();
		System.out.println("Enter the Product Name");
		prdtname=obj1.next();
		System.out.println("Enter the Quanity");
		quanity=obj1.nextInt();
		System.out.println("Enter the Price");
		price=obj1.nextInt();
		
		
	}
	public int calculation() {
		pprice =price*quanity;
		

		return pprice;
	}
	public void display(int i) {
		
		System.out.println(i+". "+"\t"+prdtid+"\t"+prdtname+"\t\t"+quanity+"  \t"+pprice);
		
	}
}

public class Bill {
	
	public static void main(String[] args) {
  	int p=0,ch=0,total=0,ttotal=0,count=0;
  	 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
     LocalDateTime now = LocalDateTime.now();  
		Scanner obj=new Scanner(System.in);
		section[] obj1 = new section[5] ;  
		System.out.println("Enter the Choice");
		while(ch<2) {
			System.out.println("1.Add"+"\t"+"2.Print");
			ch=obj.nextInt();
			
			switch(ch) {
			
			case 1: 
				count=count+1;
				obj1[count] = new section();
					obj1[count].product();
					ttotal=obj1[count].calculation();
					total=total+ttotal;
			        break;
		      case 2: 
		    	//  System.out.println("Total:"+total);
		    	  
		    	  System.out.println("\t\t "+"  TKM Super Market");
		    	  System.out.println("\t\t\t"+"Kollam");
		    	  System.out.println("\nDate & Time: "+dtf.format(now));  
		    	  System.out.println("Slno "+" Pdt_Id"+"\t"+"Pdt_Name"+"\t"+"Qty"+"  \t"+"Rate");
		    	  System.out.println("-----------------------------------------------");
		    	  for(int i=1;i<count+1;i++) {
		    		  
		    		  
		    		  obj1[i].display(i);  
		    		  
		    	
		    		}
		    	  System.out.println("-----------------------------------------------");
		    	  System.out.println("\t\t\t\t total :"+total+"\n");
		    	  System.out.println("***************** No Discount *****************"+"\n"+"***************** Vist Again *****************");
		    	  
		    	  break;
		      default:
		      System.out.println("invalid choice");
		      break; 
			
			}
		}
	}

}
