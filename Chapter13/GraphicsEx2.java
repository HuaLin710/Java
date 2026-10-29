import java.awt.*;
import java.awt.event.*;

class GraphicsEx2 extends Frame implements MouseMotionListener {
    int x = 0;
    int y = 0;

    public static void main(String[] args) {
        new GraphicsEx2("GraphicsEx2");
    }

    public GraphicsEx2(String title) {
        super(title);
        addMouseMotionListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setBounds(100, 100, 500, 500);
        setVisible(true);
    }

    public void paint(Graphics g) {
        g.drawString("Move mouse", 10, 50);
        g.drawString("*", x, y);
    }

    public void mouseMoved(MouseEvent me) {
        x = me.getX();
        y = me.getY();
        repaint();
    }

    public void mouseDragged(MouseEvent me) {}
}