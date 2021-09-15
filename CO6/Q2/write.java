import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class write
{
    public static void main(String[] args) {
        try {
            Scanner re=new Scanner(System.in);
            FileWriter obj = new FileWriter("D:\\programming\\file.txt");
            System.out.println("Write mode ON....." +
                    "");
            String a= re.nextLine();
            obj.write(a);
            obj.close();


            System.out.println("Successfully written");
            File obk = new File("D:\\programming\\file.txt");
            System.out.println("Read mode ON....." +
                    "");
            Scanner reada=new Scanner(obk);
            while(reada.hasNextLine()){
                String data= reada.nextLine();
                System.out.println(data);
            }
            reada.close();
        } catch (IOException e) {
            System.out.println("Error Occurred");
            e.printStackTrace();
        }
    }

}
