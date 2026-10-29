import java.awt.*;

class FileDialogTest {
    public static void main(String[] args) {
        Frame f = new Frame("Parent");
        f.setSize(300, 200);

        FileDialog fileOpen = new FileDialog(f, "Open File", FileDialog.LOAD);

        f.setVisible(true);
        fileOpen.setDirectory("/Users/kellylin/Documents/IKEA/AI/jdk1.8.0._291");
        fileOpen.setVisible(true);

        System.out.println(fileOpen.getDirectory() + fileOpen.getFile());
    }
}