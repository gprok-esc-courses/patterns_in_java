package strategy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BusButton extends DistanceButton {

    public BusButton() {
        setText("BUS");
    }
    @Override
    public void addListener(DistanceLabel distanceLabel, JTextField textField) {
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                distanceLabel.setDistanceStrategy(new BusStrategy());
                distanceLabel.findTime(Float.parseFloat(textField.getText()));
            }
        });
    }
}
