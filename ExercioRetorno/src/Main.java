public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Retorno áreas: ");
        double areaQuadrado = QuadrilateroRetorno.area(3);
        System.out.println("A área do quadrado é: " + areaQuadrado);
        double areaRetangulo = QuadrilateroRetorno.area(4, 2);
        System.out.println("A área do retângulo é: " + areaRetangulo);
        double areaTrapezio = QuadrilateroRetorno.area(2, 3, 6);
        System.out.println("A área do Trapézio é: " + areaTrapezio);        
    }
}
