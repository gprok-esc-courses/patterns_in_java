package strategy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WalkButton extends DistanceButton {
    public WalkButton() {
        setText("WALK");
    }
    @Override
    public void addListener(DistanceLabel distanceLabel, JTextField textField) {
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                distanceLabel.setDistanceStrategy(new WalkStrategy());
                distanceLabel.findTime(Float.parseFloat(textField.getText()));
            }
        });
    }
}
