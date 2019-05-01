package Template;

public class FrenchOrder extends Order {
    protected void calcTaxe() {
        taxe = df * 0.2;
    }
}
