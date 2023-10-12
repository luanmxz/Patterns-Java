package FactoryMethod;

public class FactoryMethodTest {

    public static void main(String[] args) {

        Dialog windowsDialog = new WindowsDialog();
        Dialog htmlDialog = new HTMLDialog();

        windowsDialog.render();
        htmlDialog.render();
    }
    
}
