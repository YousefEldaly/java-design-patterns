package refactoringguru.factory.factorymethod.factory;

import refactoringguru.factory.factorymethod.buttons.Button;

public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
