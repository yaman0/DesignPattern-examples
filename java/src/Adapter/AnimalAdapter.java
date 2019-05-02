package Adapter;

public class AnimalAdapter extends Serializable{
    private Animal a;

    AnimalAdapter(Animal a){
        this.a = a;
    }

    public Animal getA() {
        return a;
    }

    @Override
    void print() {
        System.out.println("Animal : " + a.name);
    }
}
