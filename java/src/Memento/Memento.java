package Memento;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    protected List<String> options;

    Memento() {
        this.options = new ArrayList<String>();
    }

    public void setEtat(List<String> options) {
        this.options.clear();
        this.options.addAll(options);
    }

    public List<String> getOptions() {
        return options;
    }
}
