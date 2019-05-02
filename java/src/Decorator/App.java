package Decorator;


class App {
    public static void main(String[] args) {
        Coffee c = new SimpleCoffee();
        System.out.println(c.getCost());
        c = new Milk(c);
        System.out.println(c.getCost());
        c = new Milk(c);
        System.out.println(c.getCost());
    }
}
