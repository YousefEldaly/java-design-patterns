package refactoringguru.factory.abstractfactory.factories;

import refactoringguru.factory.abstractfactory.buttons.Button;
import refactoringguru.factory.abstractfactory.buttons.WindowsButton;
import refactoringguru.factory.abstractfactory.checkboxes.Checkbox;
import refactoringguru.factory.abstractfactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
