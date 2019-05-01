package Stategy;


class App {
    public static void main (String[] args){
        Power engine = new Power();
        System.out.println(engine.pow(2,2));
        engine.setMethod(new PowerRecu());
        System.out.println(engine.pow(2,2));
    }
}
