import java.awt.*;

class FlowLayoutTest {
    public static void main(String[] args) {
        Frame f = new Frame("FlowLayoutTest");
        f.setSize(250, 100);
        f.setLayout(new FlowLayout(FlowLayout.LEFT));
        f.add(new Button("First"));
        f.add(new Button("Second"));
        f.add(new Button("Third"));
        f.add(new Button("Fourth"));
        f.add(new Button("Fifth"));
        f.setVisible(true);
    }
}