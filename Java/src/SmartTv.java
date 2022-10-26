public class SmartTv {
    
    boolean ligada = false; 
    int canal = 1 ;
    int volume = 25 ;


    public void aumentarVolume(){
        volume = volume + 1;
        System.out.println("Volume aumentado para: " + volume);
    }
    public void diminuirVolume(){
        volume = volume - 1;
        System.out.println("Volume diminuido para: " + volume);
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }    
    public void aumentarCanal(){
        canal = canal + 1;
    }
    public void diminuirCanal(){
        canal = canal - 1;
    }
    public void ligar() {
        ligada = true;
    }
    public void desligar() {
         ligada = false;
     }
}
