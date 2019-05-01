package AbstractFactory;

public class Factory {
    public Entity createA() {
        return new A();
    }

    public Entity createB() {
        return new B();
    }
}
