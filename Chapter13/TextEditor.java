import java.awt.*;
import java.awt.event.*;
import java.io.*;

class TextEditor extends Frame {
    String fileName;
    TextArea content;
    MenuBar mb;
    Menu mFile;
    MenuItem miNew, miOpen, miSaveAs, miExit;

    TextEditor(String title) {
        super(title);
        content = new TextArea();
        add(content);

        mb = new MenuBar();
        mFile = new Menu("File");
        miNew = new MenuItem("New"); 
        miOpen = new MenuItem("Open");
        miSaveAs = new MenuItem("Save As...");
        miExit = new MenuItem("Exit");

        mFile.add(miNew);
        mFile.add(miOpen);
        mFile.add(miSaveAs);
        mFile.addSeparator();   //menu separator
        mFile.add(miExit);

        mb.add(mFile);  //add menu to menuBar
        setMenuBar(mb); //add MenuBar to Frame

        //Register Event Handler to Menu
        MyHandler handler = new MyHandler();
        miNew.addActionListener(handler);
        miOpen.addActionListener(handler);
        miSaveAs.addActionListener(handler);
        miExit.addActionListener(handler);

        setSize(300, 200);
        setVisible(true);
    }

    // Method to read the file content and show on TextArea
    void fileOpen(String fileName) {
        FileReader fr;
        BufferedReader br;
        StringWriter sw;

        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            sw = new StringWriter();

            int ch = 0;
            while((ch=br.read()) != -1) {
                sw.write(ch);
            }

            br.close();
            content.setText(sw.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // save the contents of TextArea to a file
    void saveAs(String fileName) {
        FileWriter fw;
        BufferedWriter bw;

        try {
            fw = new FileWriter(fileName);
            bw = new BufferedWriter(fw);
            bw.write(content.getText());
            bw.close();
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TextEditor mainWin = new TextEditor("Text Editor");
    }

    // Menu handling
    class MyHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if(command.equals("New")) {
                content.setText("");
            } else if(command.equals("Open")) {
                FileDialog fileOpen = new FileDialog(TextEditor.this, "Open file");
                fileOpen.setVisible(true);
                fileName = fileOpen.getDirectory() + fileOpen.getFile();
                System.out.println(fileName);
                //Show the selected contents on TextArea
                fileOpen(fileName);
            } else if(command.equals("SaveAs...")) {
                FileDialog fileSave = new FileDialog(TextEditor.this, "Save file", FileDialog.SAVE);
                fileSave.setVisible(true);
                fileName = fileSave.getDirectory() + fileSave.getFile();
                System.out.println(fileName);
            } else if(command.equals("Exit")) {
                System.exit(0);
            }
        }
    }
}