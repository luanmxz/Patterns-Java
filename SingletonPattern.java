package PatternsJava.SingletonPattern;

class SinglettonPattern {

    public static void main(String[] args) {

        TestSingleton testObjectOne = TestSingleton.getInstance(); // here the count in the TestObject is 0

        testObjectOne.incrementCount(); // here testObjectOne increments one to count

        TestSingleton testObjectTwo = TestSingleton.getInstance();

        System.out.println("Count is: " + testObjectTwo.getCount());
        // here testObjectTwo gets the " 1 " becausa he gets the same instance of the
        // testObjectOne

    }
}