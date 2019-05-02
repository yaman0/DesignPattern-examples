package Proxy;

class App {
    public static void main (String[] args){
        Server s = new Server();
        Proxy p = new Proxy(s);
        p.addBanned("toto");
        p.connected("toto");
        p.connected("john");

    }
}
