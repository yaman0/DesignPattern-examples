package Builder;

public class BuilderPlayer {
    public int pv;

    public BuilderPlayer withPv(int pv) {
        this.pv = pv;
        return this;
    }

    public Player build() {
        return new Player(pv);
    }
}
