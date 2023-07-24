package headfirst.ch01strategy;


import headfirst.ch01strategy.ducks.Duck;
import headfirst.ch01strategy.ducks.MallardDuck;
import headfirst.ch01strategy.ducks.ModelDuck;
import headfirst.ch01strategy.fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}