public class ObserverApp {

    public static void main(String[] args) {

        MyObservable myObservable = new MyObservable();
        MyObserver myObserver = new MyObserver();
        MyObserver myObserver2 = new MyObserver();

        myObservable.addObserver(myObserver);
        myObservable.addObserver(myObserver2);

        myObservable.changePrice(15);

    }
}