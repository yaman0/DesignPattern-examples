package Decorator;

public class Milk extends CoffeeDecorator {

    Milk(Coffee _c) {
        super(_c);
    }

    @Override
    int getCost() {
        return super.getCost() + 2;
    }
}
