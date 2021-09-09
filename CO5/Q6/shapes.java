import java.applet.Applet;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;

public class shapes extends Applet implements ItemListener
{

    Choice choice;

    int rectX;
    int rectY;
    int rectWidth ;
    int rectHeight;
    String shape;
    int Selection;

    public void init()
    {

        choice = new Choice();
        choice.addItem("Choose the shape");
        choice.addItem("Rectangle");
        choice.addItem("Triangle");
        choice.addItem("Square");
        choice.addItem("Circle");
        add(choice);
        choice.addItemListener(this);
    }

    public void itemStateChanged (ItemEvent e)
    {
        // set new selection index
        Selection = choice.getSelectedIndex();
        repaint();
    }

    public void paint(Graphics g)
    {
        super.paint(g);

        if (Selection == 1)
        {
            g.setColor(Color.BLUE);
            g.fillRect(70,70,200,130);
            g.drawRect(70,70,200,130);
        }
        if (Selection == 2)
        {
            int xArray[] ={110,180,30,110};
            int yArray[] ={30,100,100,30};
            g.setColor(Color.yellow);
            g.fillPolygon(xArray,yArray,4);
        }
        if (Selection == 3)
        {
            g.setColor(Color.BLACK);
            g.fillRect(150,150,100,100);
            g.drawRect(150,150,100,100);
        }
        if (Selection ==4)
        {

            g.setColor(Color.red);
            g.fillOval(130,100,190,190);
            g.drawOval(130,100,190,190);
        }
    }
}
