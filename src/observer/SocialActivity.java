package observer;

public class SocialActivity implements ButtonActivity {
    @Override
    public void act(String s) {
        System.out.println("Posting on social ... " + s);
    }
}
