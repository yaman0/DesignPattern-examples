package FactoryMethod;

public abstract class OrderableInterface {
    int qty;
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void print() {
        System.out.println("Nom : "+name+"; Qty: "+qty);
    }

}
