import java.io.*;

class ExceptionEx21 {
    public static void main(String[] args) {
        File f = createFile(args[0]);
        System.out.println(f.getName() + " file is created.");
    }

    static File createFile(String fileName) {
        try {
            if (fileName == null || fileName.equals(""))
                throw new Exception("file name is not valid");
        } catch (Exception e) {
            fileName = "untitled.txt";
        } finally {
            File f = new File(fileName);
            createNewFile(f);
            return f;
        }
    }

    static void createNewFile(File f) {
        try {
            f.createNewFile();
        } catch (Exception e) {}
    }
}
