package headfirst.ch01strategy.ducks;

import headfirst.ch01strategy.fly.FlyNoWay;
import headfirst.ch01strategy.quack.Quack;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
