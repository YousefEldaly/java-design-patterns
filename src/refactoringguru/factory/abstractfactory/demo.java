package refactoringguru.factory.abstractfactory;

import refactoringguru.factory.abstractfactory.app.Application;
import refactoringguru.factory.abstractfactory.factories.GUIFactory;
import refactoringguru.factory.abstractfactory.factories.MacOSFactory;
import refactoringguru.factory.abstractfactory.factories.WindowsFactory;

public class demo {
    public static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }


    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
