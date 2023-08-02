package refactoringguru.factory.abstractfactory.factories;

import refactoringguru.factory.abstractfactory.buttons.Button;
import refactoringguru.factory.abstractfactory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();

}
