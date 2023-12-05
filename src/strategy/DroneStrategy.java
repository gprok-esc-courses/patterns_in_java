package strategy;

public class DroneStrategy implements DistanceStrategy {
    @Override
    public float getTime(float distance) {
        return distance / 100;
    }
}
