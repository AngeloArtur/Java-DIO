public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println("Qual o estado da TV? " + smartTv.ligada);
        System.out.println("Em qual canal a está a TV? " + smartTv.canal);
        System.out.println("Qual o volume da TV? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Qual o estado da TV? " + smartTv.ligada);
        smartTv.aumentarVolume();
        System.out.println("Qual o volume da TV? " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Qual o volume da TV? " + smartTv.volume);
        smartTv.subirCanal();
        System.out.println("Em qual canal a está a TV? " + smartTv.canal);
        smartTv.descerCanal();
        System.out.println("Em qual canal a está a TV? " + smartTv.canal);
        smartTv.mudarCanal(10);
        System.out.println("Em qual canal a está a TV? " + smartTv.canal);
        smartTv.desligar();
        System.out.println("Qual o estado da TV? " + smartTv.ligada);
        
    }
}
