package strategy;

import javax.swing.*;

public abstract class DistanceButton extends JButton {
    public abstract  void addListener(DistanceLabel distanceLabel, JTextField textField);
}
