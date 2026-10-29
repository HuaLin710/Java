import java.io.*;

class ExceptionEx22 {
    public static void main(String[] args) {
        try {
            File f = createFile(args[0]);
            System.out.println(f.getName() + " file is created.");
        } catch (Exception  e) {
            System.out.println(e.getMessage() + " try again.");
        }
    }

    static File createFile(String fileName) throws Exception {
        if (fileName == null || fileName.equals(""))
            throw new Exception("file name is not valid.");
        File f = new File(fileName);
        f.createNewFile();
        return f;
    }
}