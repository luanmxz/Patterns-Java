package FactoryMethod;

public class HTMLButton implements ButtonInterface {

    @Override
    public void onClick() {
        
        System.out.println(getClass() + " clicked.");
    }

    @Override
    public void render() {
        System.out.println("HTMLButton is rendering.");
    }
    
}
