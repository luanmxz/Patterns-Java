import java.util.Observable;
import java.util.Observer;

public class MyObserver implements Observer {

    private float price = 0;

    @Override
    public void update(Observable o, Object arg) {
        this.price = Float.parseFloat(arg.toString());
        System.out.println("New price of my observer is: " + this.getPrice());
    }

    public float getPrice() {
        return this.price;
    }
}
