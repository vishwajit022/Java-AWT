package F1Intro;

import java.awt.*;

class MyFrame extends Frame {
    Label l;
    TextField t;
    Button b;

    public MyFrame() {
        super("My App");
        setLayout(new FlowLayout());
        l = new Label("Name");
        t = new TextField(20);
        b = new Button("Ok");
        add(l);
        add(t);
        add(b);
    }

}

public class p2 extends Frame {
    Label l;
    TextField t;
    Button b;

    public p2() {
        super("My App");
        setLayout(new FlowLayout());
        l = new Label("Name");
        t = new TextField(20);
        b = new Button("Ok");
        add(l);
        add(t);
        add(b);
    }

    public static void main(String arg[]) {
        // MyFrame m = new MyFrame();
        // m.setSize(400, 500);
        // m.setVisible(true);

        p2 p = new p2();
        p.setVisible(true);
        p.setSize(700, 400);
        p.setLayout(new FlowLayout());

    }

}
