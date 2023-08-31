package F1Intro;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class p4_EventListeners extends Frame implements ActionListener {
    Label l;

    Button b;
    int count = 0;
    Label t;

    p4_EventListeners() {
        super("Button Demo");
        // Here count is an integer value so here we are going to pass it with empty
        // string so that it will changed to string
        l = new Label("  " + count);
        b = new Button("Click Me");
        t = new Label("Adding Event Listener to a Button");

        setLayout(new FlowLayout());
        System.out.println(" ");
        add(t);
        add(l);
        add(b);
        b.addActionListener(this);
        // this refers to the current instance of the class. In this case, your class
        // p4_EventListeners implements the ActionListener interface (implements
        // ActionListener), which means it has the required methods to handle action
        // events.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ++count;
        l.setText(" " + count);
    }

    public static void main(String arg[]) {

        p4_EventListeners p = new p4_EventListeners();
        p.setSize(500, 400);
        p.setVisible(true);

    }

}
