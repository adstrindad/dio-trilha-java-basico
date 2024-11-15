public class SmartTv {
    Boolean ligada = false;
    int canal = 5;
    int volume = 11;

    public void ligar(){
        ligada = true;
    }

    public void aumentarCanal(){
        ++canal;    
    }

    public void aumentarVolume(){
        ++volume;
    }

    public void diminuirCanal(){
        --canal;
    }
    

    public void diminuirVolume(){
        --volume;
    }
}   
