public class Quadrilatero {
    public static void area(double lado) {
        double resultado;
        resultado = lado * lado;
        System.out.println("Area do quadrado: " + resultado);
    }

    public static void area(double base, double altura) {
        double resultado;
        resultado = base * altura;
        System.out.println("Area do retângulo: " + resultado);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        double resultado;
        resultado = (baseMaior + baseMenor) * altura;
        System.out.println("Area do trapézio: " + resultado);
    }
}
