package Proxy;

import java.util.ArrayList;
import java.util.List;

public class Proxy extends InternetElement {
    private static List<String> banned;
    private InternetElement next;

    Proxy(InternetElement _next){
        next = _next;
        banned = new ArrayList<>();
    }

    @Override
    void connected(String name) {
        if(banned.contains(name))
            System.out.println("Forbidden");
        else
            next.connected(name);
    }

    public Proxy addBanned(String banned){
        this.banned.add(banned);
        return this;
    }

}
