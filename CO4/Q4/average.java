package javaprg;
import java.util.Scanner;

class NegativeIntegerException extends Exception
{
    public NegativeIntegerException(String s)
    {
        super(s);
    }
}
public class average {
    public static void sample()
    {
        try {
            int n,count=0;
            float num[];
            float total=0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of values =>");
            n = sc.nextInt();
            num = new float[n];
            System.out.println("Enter the numbers =>");
            for(int i=0;i<n;i++)
            {
                num[i] = sc.nextInt();
                try{
                if(num[i]<0)
                {
                    throw new NegativeIntegerException("Negative integer");
                }
                else
                {
                    total += num[i];
                    count++;
                }
                }catch(NegativeIntegerException e)
                {
                    System.out.println("Exception caught "+e);
                }
            }
            System.out.println("Average = "+(total/count));
        } catch (Exception e) {
            System.out.println("Exception caught "+e);
        }
    }
    public static void main(String[] args) {
        try {
            sample();
        } catch (Exception e) {
        }
    }
}