package Template;


class App {
    public static void main(String[] args) {
        FrenchOrder forder = new FrenchOrder();
        LuxOrder lorder = new LuxOrder();

        forder.setDF(2000);
        lorder.setDF(2000);
        forder.calcPrice();
        lorder.calcPrice();
        forder.print();
        lorder.print();

    }
}
