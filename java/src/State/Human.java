package State;


import State.HumanState.HumanState;
import State.HumanState.Young;

public class Human {
    public int strength;
    protected HumanState state;

    Human() {
        state = new Young(this);
        strength = (int)(Math.random() * ( 10 ));
    }

    public int strength() {
        return state.calcStrength();
    }

    public void birthday() {
        state = state.nextState();
    }

}
