package Builder;


class App {
    public static void main (String[] args){
        BuilderPlayer builder = new BuilderPlayer();
        Player p = builder.withPv(10).build();
        p.print();
    }
}
