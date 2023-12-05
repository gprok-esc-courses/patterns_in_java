package strategy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BikeButton extends DistanceButton {

    public BikeButton() {
        setText("BIKE");
    }
    @Override
    public void addListener(DistanceLabel distanceLabel, JTextField textField) {
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                distanceLabel.setDistanceStrategy(new BikeStrategy());
                distanceLabel.findTime(Float.parseFloat(textField.getText()));
            }
        });
    }
}
