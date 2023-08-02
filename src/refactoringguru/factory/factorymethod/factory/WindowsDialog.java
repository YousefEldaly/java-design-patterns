package refactoringguru.factory.factorymethod.factory;

import refactoringguru.factory.factorymethod.buttons.Button;
import refactoringguru.factory.factorymethod.buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
