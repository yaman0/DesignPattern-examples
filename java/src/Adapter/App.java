package Adapter;

import java.util.ArrayList;
import java.util.List;

class App {
    public static void main (String[] args){
        List<Serializable> array = new ArrayList<Serializable>();
        array.add(new Human("John"));
        Animal cat = new Animal("Cat");
        array.add(new AnimalAdapter(cat));
        for (Serializable s: array)
            s.print();
    }
}
