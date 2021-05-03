
public class complexnumber {
	double real, img;
	
	   //constructor to initialize the complex number
	   complexnumber(double r, double i){
		this.real = r;
		this.img = i;
	   }
		
	   public static complexnumber sum(complexnumber c1, complexnumber c2)
	   {
		//creating a temporary complex number to hold the sum of two numbers
		   complexnumber temp = new complexnumber(0, 0);

	        temp.real = c1.real + c2.real;
	        temp.img = c1.img + c2.img;
	        
	        //returning the output complex number
	        return temp;
	    }
	    public static void main(String args[]) {
	    	complexnumber c1 = new complexnumber(7.5, 2);
		complexnumber c2 = new complexnumber(1.2, 3.5);
		complexnumber temp = sum(c1, c2);
	        System.out.printf("Sum is: "+ temp.real+" + "+ temp.img +"i");
	    }
}
