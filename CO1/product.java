package TestPK;

public class product{
    int pcode;
    String pname;
    double price;
    double lowest;
    void data(int c, String n, double p){
        pcode=c;
        pname=n;
        price=p;
    }
    void display(){
        System.out.println(pcode+"\t\t"+pname+"\t\t"+price);
        
    }  
    static void findsmallest(double price1,double price2, double price3){
    if(price1<=price2 && price1<=price3){
        System.out.println("\nProduct_A is of the smallest price!");
        
    }
    else if(price2<=price1 && price2<=price3){
        System.out.println("\nProduct_B is of the smallest price!");
        
    }
    else{
        System.out.println("\nProduct_C is of the smallest price!");
        
    }
    
   }
  public static void main(String[] args){
        product obj1 = new product();
        product obj2 = new product();
        product obj3 = new product();
        obj1.data(101,"Product_A",323.5);
        obj2.data(102,"Product_B",250.00);
        obj3.data(103,"Product_C",666.00);
        System.out.println("Product Details:\n Product_Code\tProduct_Name\tProduct_Price");
        obj1.display();
        obj2.display();
        obj3.display();
        findsmallest(obj1.price,obj2.price,obj3.price);    
        
    }
}
