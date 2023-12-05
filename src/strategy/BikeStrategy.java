package strategy;

public class BikeStrategy implements DistanceStrategy {
    @Override
    public float getTime(float distance) {
        return distance / 9;
    }
}
