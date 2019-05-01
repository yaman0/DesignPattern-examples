package Memento;

class App {
    public static void main (String[] args){
        MyObject obj = new MyObject();
        Memento beforeB = obj.addOptions("A");
        obj.addOptions("B");
        obj.print();
        obj.revert(beforeB);
        obj.print();
    }
}
