package headfirst.ch07adapterandfacade.adapter.turkeyduck;

public class MallaradDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
