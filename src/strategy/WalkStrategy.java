package strategy;

public class WalkStrategy implements DistanceStrategy {
    @Override
    public float getTime(float distance) {
        return distance / 5;
    }
}
