package Stategy;

public class PowerRecu extends PowerMethod {

    @Override
    public int pow(int n, int j) {
        if (j==1) {
            System.out.println("Recu");
            return n;
        }
        else {
            return n * pow(n,j-1);
        }
    }
}
