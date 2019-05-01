package Stategy;

public class Power {
    public PowerMethod method;
    public Power() {
        method = new PowerFor();
    }

    public void setMethod(PowerMethod method) {
        this.method = method;
    }

    public int pow(int a,int b){
        return method.pow(a,b);
    }
}
