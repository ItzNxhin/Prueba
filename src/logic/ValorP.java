package logic;

public class ValorP extends IntComp {
    public double calcular(double n, double tasaInteres, double interesCompuesto ){
        double a;
        a = 1+tasaInteres;
        a = Math.pow(a,n);
        a = interesCompuesto/a;
        return a;
    }

}
