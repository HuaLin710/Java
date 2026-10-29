import java.awt.*;
import java.awt.event.*;

class PaintFrameTest {
    public static void main(String args[]) {
        PaintFrame f = new PaintFrame("PaintFrame");
        Graphics g = f.getGraphics();
        g.setColor(Color.red);

        for(int i=0; true; i+=f.speed) {
            try {
                Thread.sleep(100);
            } catch(InterruptedException e) {}

            g.clearRect(0, 0, 300, 300);
            g.drawString("Hello", i, 150);
            i = (i<300) ? i : 0;
        } 
    }
}

class PaintFrame extends Frame {
    int speed = 1;
    Scrollbar sb = new Scrollbar(Scrollbar.HORIZONTAL, 0, 5, 0, 50);
    Label lSpeed = new Label("Speed : 1");

    PaintFrame(String title) {
        super(title);
        lSpeed.setBackground(Color.yellow);
        lSpeed.setSize(65, 15);
        lSpeed.setLocation(10, 30);
        sb.setSize(260, 20);
        sb.setLocation(20, 250);
        add(sb);
        add(lSpeed);
        sb.addAdjustmentListener(new MyHandler());
        addWindowListener(new MyHandler());
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        setResizable(false);
    }

    class MyHandler extends WindowAdapter implements AdjustmentListener {
        public void adjustmentValueChanged(AdjustmentEvent e) {
            speed = sb.getValue();
            lSpeed.setText("Speed : " + speed);
        }

        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }

    }
}                                                                                                                                                                                                                                                                                                                                       