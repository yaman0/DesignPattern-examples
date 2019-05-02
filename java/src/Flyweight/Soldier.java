package Flyweight;

public class Soldier {
    int pv;
    Soldier(){
        pv=100;
    }
    void hydrate(int _pv){
        pv = _pv;
    }
    void print(){
        System.out.println("Soldier : "+pv);
    }
}

