import java.awt.*;
import java.applet.*;

public class largof3 extends Applet
{
    TextField Txt1,Txt2,Txt3;

    public void init(){
        Txt1 = new TextField(10);
        Txt2 = new TextField(10);
        Txt3 = new TextField(10);

        add(Txt1);
        add(Txt2);
        add(Txt3);

        Txt1.setText("num1");
        Txt2.setText("num2");
        Txt3.setText("num3");
    }

    public void paint(Graphics g){
        int a, b, c,result;
        String str;



        str=Txt1.getText();
        a=Integer.parseInt(str);
        str=Txt2.getText();
        b=Integer.parseInt(str);
        str=Txt3.getText();
        c=Integer.parseInt(str);
        if (a>b) {
            if (a>c)
                result=a;
            else
                result=c;
        }
        else{
            if (b>c)
                result=b;
            else
                result=c;
        }
        g.drawString("Largest number is "+result,10,70);
    }

    public boolean action(Event e, Object o){
        repaint();
        return true;
    }
}