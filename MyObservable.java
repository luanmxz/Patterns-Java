import java.util.Observable;
import java.util.Observer;

public class MyObservable extends Observable {

    private float price = 0;

    @Override
    public synchronized int countObservers() {
        return super.countObservers();
    }

    public void changePrice(float price) {
        this.price = price;
        setChanged();
        notifyObservers(this.price);
        System.out.println("Subscribers amount: " + this.countObservers());
    }
}
