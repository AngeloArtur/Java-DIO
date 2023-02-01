class Calculadora implements Operacao {
    @Override
    public void somar(int numero1, int numero2) {
        System.out.println(numero1+numero2);
    }
    
    @Override
    public void subtrair(int numero1, int numero2) {
        System.out.println(numero1-numero2);
    }
    
    @Override
    public void multiplicar(int numero1, int numero2) {
        System.out.println(numero1*numero2);
    }
    
    @Override
    public void dividir(int numero1, int numero2) {
        System.out.println(numero1/numero2);
    }
}
