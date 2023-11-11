    package logic;

    public class TiempoCal extends IntComp {
        public double calcular(double tasaInteres, double ic, double vP ){
            double a;
            double b;
            a = Math.log(ic/vP);
            b = Math.log(1 + tasaInteres);
            return a/b;
        }

    }
