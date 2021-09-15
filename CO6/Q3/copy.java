import java.io.*;
import java.util.*;

public class copy {
    public static  void main(String[] args) throws Exception{
        Scanner re = new Scanner(System.in);
        System.out.println("Enter the path of the source file");
        String sc=re.next();
        System.out.println("Enter the path of the destination file:");
        String dc=re.next();
        System.out.println("Copying........");
        FileReader ra= new FileReader(sc);
        FileWriter wr =new FileWriter(dc,true);
        int c;
        while((c= ra.read()) !=-1){
            wr.write(c);

        }
        System.out.println("Copied........");
        ra.close();
        wr.close();
    }
}
