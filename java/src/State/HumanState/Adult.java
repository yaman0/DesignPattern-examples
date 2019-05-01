package State.HumanState;

import State.Human;

public class Adult extends HumanState {
    String name;

    public Adult(Human h) {
        super(h);
        name = "Adult";
    }

    public int calcStrength() {
        return me.strength * 2;
    }

    @Override
    public HumanState nextState() {
        return new Old(me);
    }

    ;
}
