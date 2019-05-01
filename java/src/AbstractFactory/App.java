package AbstractFactory;

import Memento.Memento;
import Memento.MyObject;

class App {
    public static void main (String[] args){
        Factory facto = new Factory();
        facto.createA().print();
        facto.createB().print();
    }
}
