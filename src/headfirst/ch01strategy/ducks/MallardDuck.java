package headfirst.ch01strategy.ducks;

import headfirst.ch01strategy.fly.FlyWithWings;
import headfirst.ch01strategy.quack.Quack;

public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display() {
        System.out.println("I'm a real Mallarad duck!");
    }
}
