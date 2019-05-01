package State;

class App {
    public static void main (String[] args){
        Human me = new Human();
        System.out.println(me.strength());
        me.birthday();
        System.out.println(me.strength());
        me.birthday();
        System.out.println(me.strength());
    }
}
