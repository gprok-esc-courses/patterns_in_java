package strategy;

public class CarStrategy implements DistanceStrategy {

    @Override
    public float getTime(float distance) {
       return distance / 70;
    }
}
