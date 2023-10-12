package FactoryMethod;

abstract class Dialog {

    public abstract ButtonInterface createButton();

    public void render(){
        ButtonInterface okButton = createButton();
        okButton.onClick();
        okButton.render();
    }
}