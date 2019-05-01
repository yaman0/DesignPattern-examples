package FactoryMethod;

public class Order {
    int qty;
    public OrderableInterface sendOrder(String name, int qty){
        Product p = createProduct();
        p.setName(name);
        p.setQty(qty);
        return p;
    }
    private Product createProduct(){
        return new Product();
    }
}
