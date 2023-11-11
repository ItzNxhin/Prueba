package logic;

public class ValorF extends IntComp {
    public double calcular(double vP, double interes, double tiempo ){
        double a;
            
        a = Math.pow(1+interes, tiempo);
        return a*vP;
    }


}
