import java.awt.*;

class BorderLayoutTest {
    public static void main(String[] args) {
        Frame f = new Frame("BorderLayoutTest");
        f.setSize(200, 200);
        f.setLayout(new BorderLayout());
        Button north = new Button("North");
        Button south = new Button("South");
        Button west = new Button("West");
        Button east = new Button("East");
        Button center = new Button("Center");

        f.add(north, BorderLayout.NORTH);
        f.add(west, "West");
        f.add(south, "South");
        f.add(east, "East");
        f.add(center, "Center");

        f.setVisible(true);
    }
}