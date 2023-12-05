package observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
This is an example to demonstrate the problem.
Every time the action of the button changes, we need to change the class.
 */
public class SimpleWindow {

    private JFrame window;
    private JTextField textField;
    private JButton button;

    public SimpleWindow() {
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

    public void buttonAction(String msg) {
        // System.out.println("Sending email ..." + msg);
        System.out.println("Saving in the DB ..." + msg);
        System.out.println("Writing in log file ..." + msg);
        System.out.println("Posting on social ..." + msg);
    }

    public static void main(String[] args) {
        SimpleWindow w = new SimpleWindow();
    }

}
