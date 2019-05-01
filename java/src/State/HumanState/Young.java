package State.HumanState;

import State.Human;

public class Young extends HumanState {
    String name;

    public Young(Human h) {
        super(h);
        name = "Young";
    }

    public int calcStrength() {
        return me.strength;
    }

    @Override
    public HumanState nextState() {
        return new Adult(me);
    }

    ;
}
