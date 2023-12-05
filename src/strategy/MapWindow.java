package strategy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class MapWindow {

    private JFrame window;
    private JTextField textField;
    private JButton busB, walkB, carB, bikeB;
    private ArrayList<DistanceButton> buttons;
    private DistanceLabel label;

    public MapWindow(ArrayList<DistanceButton> buttons) {
        window = new JFrame();
        this.buttons = buttons;
        window.setSize(500, 200);
        textField = new JTextField();
        window.add(textField, BorderLayout.NORTH);
        label = new DistanceLabel();
        window.add(label, BorderLayout.CENTER);
        JPanel panel = new JPanel();

        for(DistanceButton b : buttons) {
            panel.add(b);
            b.addListener(label, textField);
        }


        window.add(panel, BorderLayout.SOUTH);

        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
    }


    public static void main(String[] args) {
        ArrayList<DistanceButton> buttons = new ArrayList<>();
        buttons.add(new BusButton());
        buttons.add(new WalkButton());
        buttons.add(new CarButton());
        buttons.add(new BikeButton());
        buttons.add(new DroneButton());
        MapWindow m = new MapWindow(buttons);
    }

}
