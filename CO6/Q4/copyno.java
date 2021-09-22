import java.io.*;
import java.io.FileReader;

class copyno
{
    public static void main(String args[]) throws IOException {
        FileReader frs= new FileReader("D:\\programming\\number.txt");
        FileInputStream fr = new FileInputStream("D:\\programming\\number.txt");
        FileOutputStream fw1 = new FileOutputStream("D:\\programming\\even.txt");
        FileOutputStream fw2 = new FileOutputStream("D:\\programming\\odd.txt");

        int i;
        while((i=frs.read()) != -1)

        {
            int j = i;
            if(j%2==0) {
                fw1.write(j);
              //  System.out.println(i);
            }
            else {

               fw2.write(j);
               // System.out.println( i);
            }
        }
        System.out.println("////Moved/////");
        fr.close();
        fw1.close();
        fw2.close();

    }
}
