package TestPK;

public class cpu {
	
	int price;
	
	public class processor
	{
		int no_of_core;
		String manufacturer;
		
		
	}
	static class RAM
	{
		 int memory;
		 String manufacturer;
		 
	}

	public void display(int x,int y,int z,String g, String f)
	{	System.out.println("\n Processor");
		System.out.println("\n Price-> "+x+"\n"+"Number of cores-> "+y+"\n"+"Manufacturer-> "+z);
		System.out.println("\n RAM ");
		System.out.println(" \n Memory: "+g+"\n"+"Manufacturer: "+z);
	}

	public static void main(String[] args) {
		int x,y,z;
		String g,f;
		
		cpu obj=new cpu();
		cpu.processor obj1=obj.new processor();
		
		x=obj.price=17964;
		y=obj1.no_of_core=6;
		g=obj1.manufacturer="Ryzen";
		
		cpu.RAM obj2=new RAM();
		z=obj2.memory=16;
		f=obj2.manufacturer="Crucial";
		
		
		obj.display(x,y,z,g,f);
		
			

	}

}