public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Moto moto = new Moto();

        carro1.setCor("Branco");
        carro1.setModelo("BMW Série 3");
        carro1.setCapacidadeLitros(59);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeLitros());
        System.out.println(carro1.valorTanque(6.33));

        moto.setCor("Vermelha");
        moto.setModelo("Twister 250");
        moto.setCapacidadeLitros(20);

        System.out.println(moto.getCor());
        System.out.println(moto.getModelo());
        System.out.println(moto.getCapacidadeLitros());
        System.out.println(moto.valorTanque(6.33));
    }
}
