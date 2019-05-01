package Stategy;

public class PowerFor extends PowerMethod {

    @Override
    public int pow(int n, int j) {
        System.out.println("For");
        int r = n;
        for (int i = 0; i < j - 1; i++) {
            r *= n;
        }
        return r;
    }
}
