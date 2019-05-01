package Template;

public class LuxOrder extends Order {
    protected void calcTaxe() {
        taxe = df * 0.15;
    }
}
