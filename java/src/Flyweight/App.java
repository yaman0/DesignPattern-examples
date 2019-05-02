package Flyweight;



class App {
    public static void main (String[] args){
        Company c = new Company(5);
        c.pvSoldier[2] = 10;
        c.printLife();
    }
}
