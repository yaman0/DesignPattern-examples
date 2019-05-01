package State.HumanState;

import State.Human;

public abstract class HumanState {
    String name = "";
    Human me;
    HumanState(Human human){
        me = human;
    }
    public abstract int calcStrength();
    public abstract HumanState nextState();
}
