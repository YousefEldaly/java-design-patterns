package headfirst.ch04factory.factorymethod;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }


    // overrides the cut() method to cut the pizza into squares"chicago style"
    @Override
    void cut() {
        System.out.println("Cutting the pizza in to square slices");
    }
}
