package observer;

public class DBActivity implements ButtonActivity {
    @Override
    public void act(String s) {
        System.out.println("Saving in the DB ..." + s);
    }
}
