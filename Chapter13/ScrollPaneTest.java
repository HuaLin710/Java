import java.awt.*;

class ScrollPaneTest {
    public static void main(String[] args) {
        Frame f = new Frame("ScrollPaneTest");
        f.setSize(300, 200);

        ScrollPane sp = new ScrollPane();
        Panel p = new Panel();
        p.setBackground(Color.green);
        p.add(new Button("Button 1"));
        p.add(new Button("Button 2"));
        p.add(new Button("Button 3"));
        p.add(new Button("Button 4"));

        sp.add(p);
        f.add(sp);
        f.setVisible(true);
    }
}