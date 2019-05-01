package Observer;

public class HumanLog implements Obs {
    HumanLog() {
        System.out.println("I'm watching");
    }

    public void actualise(Subject target) {
        System.out.println("Ho ! I'm changing");
        target.print();
    }
}
