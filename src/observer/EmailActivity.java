package observer;

public class EmailActivity implements  ButtonActivity {

    @Override
    public void act(String s) {
        System.out.println("Sending email ..." + s);
    }
}
