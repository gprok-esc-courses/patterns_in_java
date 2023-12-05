package strategy;

public class BusStrategy implements DistanceStrategy {
    @Override
    public float getTime(float distance) {
        return distance / 20;
    }
}
