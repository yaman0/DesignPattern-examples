package Flyweight;


public class Company {
    Soldier soldier;
    int[] pvSoldier;
    int size;
    Company(int size){
        soldier=new Soldier();
        this.size = size;
        pvSoldier = new int[size];
        for (int i = 0; i < size; i++) {
            pvSoldier[i] = 100;
        }
    }
    void printLife() {
        for (int i = 0; i < pvSoldier.length; i++) {
            soldier.hydrate(pvSoldier[i]);
            soldier.print();
        }
    }
}
