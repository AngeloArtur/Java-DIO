public class QuadrilateroRetorno {
    public static double area(double lado) {
        double resultado;
        resultado = lado * lado;
        return resultado;
    }

    public static double area(double base, double altura) {
        double resultado;
        resultado = base * altura;
        return resultado;
    }

    public static double area(double baseMaior, double baseMenor, double altura) {
        double resultado;
        resultado = (baseMaior + baseMenor) * altura;
        return resultado;
    }
}