package observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/*
This is an example to demonstrate the problem.
Every time the action of the button changes, we need to change the class.
 */
public class ObserverWindow {

    private JFrame window;
    private JTextField textField;
    private JButton button;

    private ArrayList<ButtonActivity> activities;

    public ObserverWindow() {
        activities = new ArrayList<>();
        window = new JFrame();
        window.setSize(400, 300);
        textField = new JTextField();
        window.add(textField, BorderLayout.NORTH);
        button = new JButton("Click Me");
        window.add(button, BorderLayout.SOUTH);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg = textField.getText();
                buttonAction(msg);
            }
        });

        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public void addButtonActivity(ButtonActivity ba) {
        activities.add(ba);
    }

    public void buttonAction(String msg) {
        for(ButtonActivity ba : activities) {
            ba.act(msg);
        }
    }

    public static void main(String[] args) {

        ObserverWindow w = new ObserverWindow();
        w.addButtonActivity(new EmailActivity());
        w.addButtonActivity(new LogActivity());
        w.addButtonActivity(new DBActivity());
        w.addButtonActivity(new SocialActivity());
    }

}
