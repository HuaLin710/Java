import java.awt.*;
import java.awt.event.*;

class CheckboxEventTest extends Frame {
    Label q1;
    Label q2;
    Label score;
    Checkbox q1cb1, q1cb2, q1cb3, q1cb4;
    Checkbox q2cb1, q2cb2, q2cb3, q2cb4;
    CheckboxGroup group;
    Button end;

    CheckboxEventTest(String title) {
        super(title);
        setSize(500, 300);
        setLayout(new GridLayout(13, 1));

        q1 = new Label("1. In which cases is ActionEvent's actionPerformed method "
            + "called? (Select all that apply.)");
        q1cb1 = new Checkbox("When a Button is pressed");
        q1cb2 = new Checkbox("When Enter is pressed in a TextField");
        q1cb3 = new Checkbox("When a MenuItem is clicked");
        q1cb4 = new Checkbox("When an item is selected by double-clicking in a List");

        q2 = new Label("2. What is the default LayoutManager of Frame? (Select one.)");
        group = new CheckboxGroup();
        q2cb1 = new Checkbox("FlowLayout", group, false);
        q2cb2 = new Checkbox("GridLayout", group, false);
        q2cb3 = new Checkbox("BorderLayout", group, false);
        q2cb4 = new Checkbox("CardLayout", group, false);

        score = new Label("* Result:");
        end = new Button("Press this button to see your score.");
        end.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                float totalScore = 0;
                if(q1cb1.getState()) 
                    totalScore += 12.5;
                if(q1cb2.getState())
                    totalScore += 12.5;
                if(q1cb3.getState())
                    totalScore += 12.5;
                if(q1cb4.getState())
                    totalScore += 12.5;
                if(q2cb3.getState())
                    totalScore += 50;
                score.setText("* Result: Your score is " + totalScore + " points.");
            }
        });

        add(q1);
        add(q1cb1);
        add(q1cb2);
        add(q1cb3);
        add(q1cb4);
        add(q2);
        add(q2cb1);
        add(q2cb2);
        add(q2cb3);
        add(q2cb4);
        add(end);
        add(score);

        setVisible(true);
    }

    public static void main(String[] args) {
        CheckboxEventTest mainWin = new CheckboxEventTest("CheckboxEventTest - Quiz");
    }
    
}