import java.awt.*;

class CheckboxTest {
    public static void main(String args[]) {
        Frame f = new Frame("Questions");
        f.setSize(305, 250);
        f.setLayout(new FlowLayout());

        Label q1 = new Label("1. What are your interests?(Multiple answers)");
        Checkbox news = new Checkbox("news", true);
        Checkbox sports = new Checkbox("sports");
        Checkbox movies = new Checkbox("movies");
        Checkbox music = new Checkbox("music");

        f.add(q1);
        f.add(news);
        f.add(sports);
        f.add(movies);
        f.add(music);

        Label q2 = new Label("2. How offen do you go to theatre?");
        CheckboxGroup group1 = new CheckboxGroup();
        Checkbox movie1 = new Checkbox("Once a month", group1, true);
        Checkbox movie2 = new Checkbox("Once a week", group1, false);
        Checkbox movie3 = new Checkbox("Twice a week", group1, false);

        f.add(q2);
        f.add(movie1);
        f.add(movie2);
        f.add(movie3);

        Label q3 = new Label("3. How long do you use computer everyday?");
        CheckboxGroup group2 = new CheckboxGroup();
        Checkbox com1 = new Checkbox("Less than 5 hours", group2, true);
        Checkbox com2 = new Checkbox("Less than 10 hours", group2, false);
        Checkbox com3 = new Checkbox("More than 15 hours", group2, false);

        f.add(q3);
        f.add(com1);
        f.add(com2);
        f.add(com3);

        f.setVisible(true);
    }
}