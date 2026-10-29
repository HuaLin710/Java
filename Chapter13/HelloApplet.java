import java.awt.*;

public class HelloApplet extends java.applet.Applet {
    public void paint(Graphics g) {
        setBackground(Color.lightGray);
        g.drawString("Hello, Applet.", 50, 50);
    }
}