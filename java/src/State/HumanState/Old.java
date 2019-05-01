package State.HumanState;

import State.Human;

public class Old extends HumanState {
    String name;

    public Old(Human h) {
        super(h);
        name = "Old";
    }

    public int calcStrength() {
        return (int) (me.strength * 0.5);
    }

    @Override
    public HumanState nextState() {
        return null;
    }

    ;
}
