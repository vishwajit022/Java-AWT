package F1Intro;

import java.awt.*;

public class p1 {
    public static void main(String arg[]) {

        Frame f = new Frame("FIrst App");
        f.setSize(800, 500);
        f.setVisible(true);
        // To show and create Frame in Java Program

        Button b = new Button("OK");

        f.setLayout(null);
        f.setLayout(new FlowLayout());
        // The line f.setLayout(new FlowLayout()); in your Java code is setting the
        // layout manager for the Frame object f to be a FlowLayout.
        Label l = new Label("Name");
        TextField t = new TextField(20);
        f.add(l);
        f.add(t);
        f.add(b);

    }
}