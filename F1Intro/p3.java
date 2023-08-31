package F1Intro;

import java.awt.*;

public class p3 extends Frame {
    Label l;
    Button b;
    TextField t;

    p3() {
        l = new Label("App");
        b = new Button("Submit");
        t = new TextField(50);
        setLayout(new FlowLayout(9));
        add(l);
        add(t);
        add(b);

    }

    public static void main(String arg[]) {
        p3 f = new p3();
        f.setSize(700, 450);
        f.setVisible(true);

    }
}
