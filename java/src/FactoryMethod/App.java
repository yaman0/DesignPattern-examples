package FactoryMethod;


class App {
    public static void main (String[] args){
        Order o = new Order();
        OrderableInterface p = o.sendOrder("banana", 10);
        p.print();
    }
}
