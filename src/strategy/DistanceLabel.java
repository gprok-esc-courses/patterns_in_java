package strategy;

import javax.swing.*;

public class DistanceLabel extends JLabel {
    private DistanceStrategy distanceStrategy;

    public  void setDistanceStrategy(DistanceStrategy ds) {
        distanceStrategy = ds;
    }

    public void findTime(float distance) {
        float time = distanceStrategy.getTime(distance);
        setText("Time: " + time);
    }

}
