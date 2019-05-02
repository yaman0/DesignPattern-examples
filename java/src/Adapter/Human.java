package Adapter;

public class Human extends Serializable {
    String name;

    Human(String name){
        this.name = name;
    }

    @Override
    void print() {
        System.out.println("Human : " + name);
    }
}
