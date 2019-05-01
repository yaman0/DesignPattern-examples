package Observer;

public class Human extends Subject {
    public String name;
    public int pv;
    public int pm;

    Human() {
        HumanLog log = new HumanLog();
        add(log);
        name = "";
        pv = 0;
        pm = 0;
    }

    public void setName(String name) {
        this.name = name;
        this.notifyObs(this);
    }

    public void setPv(int pv) {
        this.pv = pv;
        this.notifyObs(this);
    }

    public void setPm(int pm) {
        this.pm = pm;
        this.notifyObs(this);
    }

    public void print() {
        System.out.println("------");
        System.out.println("My name : " + name);
        System.out.println("My pv : " + pv);
        System.out.println("My pm : " + pm);
        System.out.println("------");
        System.out.println("");
    }

}
