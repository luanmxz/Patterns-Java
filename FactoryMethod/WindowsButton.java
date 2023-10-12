package FactoryMethod;

public class WindowsButton implements ButtonInterface {

    @Override
    public void onClick() {
        
        System.out.println(getClass() + " clicked.");
    }

    @Override
    public void render() {
        System.out.println("WindowsButton is rendering.");
    }
    
}
