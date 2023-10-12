package FactoryMethod;

public class HTMLDialog extends Dialog {

    @Override
    public ButtonInterface createButton() {
        
        return new HTMLButton();
    }
    
}
