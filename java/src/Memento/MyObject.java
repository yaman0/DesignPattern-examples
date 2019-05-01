package Memento;

import java.util.ArrayList;
import java.util.List;

public class MyObject {
    protected List<String> options;
    MyObject(){
        this.options = new ArrayList<String>();
    }
    public Memento addOptions(String option) {
        Memento memento = new Memento();
        options.add(option);
        memento.setEtat(options);
        return memento;
    }
    public void revert(Memento m) {
        options.clear();
        options.addAll(m.getOptions());
    }
    public void print() {
        System.out.println("Object");
        for (String option: options)
            System.out.println(option);
        System.out.println();
    }
}
