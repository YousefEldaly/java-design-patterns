package refactoringguru.factory.abstractfactory.app;

import refactoringguru.factory.abstractfactory.buttons.Button;
import refactoringguru.factory.abstractfactory.checkboxes.Checkbox;
import refactoringguru.factory.abstractfactory.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
