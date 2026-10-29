import java.awt.*;

class TextAreaTest {
    public static void main(String[] args) {
        Frame f = new Frame("Comments");
        f.setSize(400, 220);
        f.setLayout(new FlowLayout());

        TextArea comments = new TextArea("Enter your comments. ", 10, 50);

        f.add(comments);
        comments.selectAll();
        f.setVisible(true);
    }
}