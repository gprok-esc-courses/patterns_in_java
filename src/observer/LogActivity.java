package observer;

public class LogActivity implements ButtonActivity {
    @Override
    public void act(String s) {
        System.out.println("Writing in log file ..." + s);
    }
}
