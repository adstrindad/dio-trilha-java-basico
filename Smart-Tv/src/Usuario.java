public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Status do canal: " + smartTv.canal);
        System.out.println("Status do volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Novo status -> Volume atual: " + smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("Novo status -> Canal atual: " +  smartTv.canal);


        
    }
}
