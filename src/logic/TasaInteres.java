package logic;

public class TasaInteres extends IntComp{

    public double calcular(double n, double ic, double vP ){
        double a;
        a = ic / vP;
        a = Math.pow(a, (1/n)) - 1;
        return a;
    }

    



}
