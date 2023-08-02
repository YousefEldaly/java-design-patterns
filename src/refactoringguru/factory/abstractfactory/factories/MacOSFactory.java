package refactoringguru.factory.abstractfactory.factories;

import refactoringguru.factory.abstractfactory.buttons.Button;
import refactoringguru.factory.abstractfactory.buttons.MacOSButton;
import refactoringguru.factory.abstractfactory.checkboxes.Checkbox;
import refactoringguru.factory.abstractfactory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
