package strategy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarButton extends DistanceButton {
    public CarButton() {
        setText("CAR");
    }
    @Override
    public void addListener(DistanceLabel distanceLabel, JTextField textField) {
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                distanceLabel.setDistanceStrategy(new CarStrategy());
                distanceLabel.findTime(Float.parseFloat(textField.getText()));
            }
        });
    }
}
