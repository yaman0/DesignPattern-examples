package Proxy;

public class Server extends InternetElement{
    @Override
    void connected(String name) {
        System.out.println("Welcome "+name);
    }
}
