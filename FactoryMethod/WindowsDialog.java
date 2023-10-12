package FactoryMethod;

public class WindowsDialog extends Dialog {

    @Override
    public ButtonInterface createButton() {
        
        return new WindowsButton();
    }
    
}
