package Decorator;

public abstract class CoffeeDecorator extends Coffee{
    Coffee c;
    CoffeeDecorator(Coffee _c){
        c = _c;
    }

    @Override
    int getCost() {
        return c.getCost();
    }
}
