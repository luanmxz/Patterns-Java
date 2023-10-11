package PatternsJava.SingletonPattern;

public class TestSingleton {

    private static TestSingleton instance;
    public int count = 0;

    public static TestSingleton getInstance() {
        if (instance == null) {
            instance = new TestSingleton();
        }

        return instance;
    }

    public int getCount() {
        return this.count;
    }

    public void incrementCount() {
        this.count++;
    }
}
