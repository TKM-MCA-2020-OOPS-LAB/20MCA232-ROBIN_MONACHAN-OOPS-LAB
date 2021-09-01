package javaprg;
import java.util.*;

public class mapcoll {


		public static void main(String args[])
	    {
	       
	        Map<Integer, String> mp = new HashMap<>();
	        //Inserting elements..   
	        System.out.println("Enter the limit:");
	        Scanner inp = new Scanner(System.in);
	        int n= inp.nextInt();
	        System.out.println("Enter the Roll number and Name");
	        while(n!=0) {
	        	
	        	int e= inp.nextInt();
	        	String s= inp.next();
	        	mp.put(e, s);
	        	n--;
	        }
	        
	  
	        System.out.println("Initial Map:"+mp);
	        
	   
	        mp.put( (2), "David");
	        
	        //Updating..
	        System.out.println("Updated Map:"+mp);
	  
	        //Removing..
	        System.out.println("Enter the Roll number to be removed:");
	        int r=inp.nextInt();
	        mp.remove(r);
	  
	        // Final Map..
	        
	        System.out.println("After Removing the entry, Final Map  is:"+mp);
	    
	    }
	}