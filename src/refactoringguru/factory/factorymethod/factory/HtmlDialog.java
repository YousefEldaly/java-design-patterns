package refactoringguru.factory.factorymethod.factory;

import refactoringguru.factory.factorymethod.buttons.Button;
import refactoringguru.factory.factorymethod.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
