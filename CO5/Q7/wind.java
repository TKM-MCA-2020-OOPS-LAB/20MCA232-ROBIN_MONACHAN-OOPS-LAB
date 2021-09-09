import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class wind extends Frame implements  WindowListener{
    wind(){
        addWindowListener(this);

        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new wind();
        new MouseList();
    }
    public void windowActivated(WindowEvent arg0) {
        System.out.println("activated");
    }
    public void windowClosed(WindowEvent arg0) {
        System.out.println("closed");
    }
    public void windowClosing(WindowEvent arg0) {
        System.out.println("closing");
        dispose();
    }
    public void windowDeactivated(WindowEvent arg0) {
        System.out.println("deactivated");
    }
    public void windowDeiconified(WindowEvent arg0) {
        System.out.println("deiconified");
    }
    public void windowIconified(WindowEvent arg0) {
        System.out.println("iconified");
    }
    public void windowOpened(WindowEvent arg0) {
        System.out.println("opened");
    }
}


class MouseList extends Frame implements MouseListener{
    Label l;
    MouseList(){
        addMouseListener(this);

        l=new Label();
        l.setBounds(20,50,100,20);
        add(l);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }
    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }
    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }
    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
    }

}
