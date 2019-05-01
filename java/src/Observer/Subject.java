package Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    protected List<Obs> obs = new ArrayList<Obs>();

    public void add(Obs o) {
        obs.add(o);
    }

    public void remove(Obs o) {
        obs.remove(o);
    }

    public void notifyObs(Subject target) {
        for (Obs o: obs)
            o.actualise(target);
    }

    public abstract void print();
}
