import java.applet.Applet;
import java.awt.*;

public class geometric extends Applet{
    public void paint(Graphics g){
        g.fillRect(50, 80, 200, 40);
        g.setColor(Color.black);

        g.drawLine(40,25, 200, 25);
        g.setColor(Color.black);

        g.fillOval(250,150,100,100);
        g.setColor(Color.black);

        int x1[]={40, 130, 200, 50};
        int y1[]={310, 260, 310, 310};
        int n1=4;
        g.fillPolygon(x1, y1, n1);
    }
}