package strategy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DroneButton extends DistanceButton {
    public DroneButton() {
        setText("DRONE");
    }

    @Override
    public void addListener(DistanceLabel distanceLabel, JTextField textField) {
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                distanceLabel.setDistanceStrategy(new DroneStrategy());
                distanceLabel.findTime(Float.parseFloat(textField.getText()));
            }
        });
    }
}
