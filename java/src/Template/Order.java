package Template;

public abstract class Order {
    double df;
    double taxe;
    double price;

    protected abstract void calcTaxe();

    public void setDF(double df) {
        this.df = df;
    }

    public void calcPrice() {
        this.calcTaxe();
        price = taxe+df;
    }

    public void print() {
        System.out.println("Order");
        System.out.println("Price df " + df);
        System.out.println("Price " + price);
        System.out.println();
    }
}
