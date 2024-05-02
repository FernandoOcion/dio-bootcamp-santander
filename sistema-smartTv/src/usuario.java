public class usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        smartTv.ligar();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.mudarCanal(6);

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

    }
}
