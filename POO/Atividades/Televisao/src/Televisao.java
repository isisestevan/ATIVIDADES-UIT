public class Televisao {
    private int volume;
    private int volMax;
    private int qtdCanais;
    private int canal;
    private boolean liga;
    private boolean desliga;
    private String marca;
    
    public Televisao(String marca){
        setMarca(marca);
    }
    public Televisao(String marca,int qtdCanais,int volMax){
        setMarca(marca);
        setQtdCanais(qtdCanais);
        setVolMax(volMax);
    }
    public int getQtdCanais() {
        return qtdCanais;
    }
    public void setQtdCanais(int qtdCanais) {
        this.qtdCanais = qtdCanais;
    }
    public int getVolMax() {
        return volMax;
    }
    public void setVolMax(int volMax) {
        this.volMax = volMax;
    }
    
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getVolume() {
        return volume;
    }
    
    public int getCanal() {
        return canal;
    }
    public void ligaTV(){
        liga = true;
    }

    public void desligaTV(){
        desliga=true;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void setVolume(int volume) {
        
        this.volume = volume;
        
    } 
    
    public void aumentaVol(){
        if(liga == true && volume<volMax){
        this.volume++;
        }
    }

    public void abaixaVol(){
        if(liga==true && volume>0){
        this.volume--;
        }
    }

    public void aumentaCanal(){
    if(liga==true){
        canal=(canal % qtdCanais)+1;
    }
    }

    public void abaixaCanal(){
        if(liga==true){
            canal=(canal % qtdCanais)-1;
        }

    }
    public void procuraCanal(int canal){
        if(canal < 0 || canal>qtdCanais){
            System.out.println("Esse canal não está na lista\n");
        }else{
            this.canal=canal;
        }
    }

    public void showTV(){
        System.out.println("Volume:\n"+getVolume());
        System.out.println("Canal:\n"+getCanal());
    }

    @Override
    public String toString() {
      return ""
        + "\nMarca: " + marca
        + "\nCanal Atual: " + canal 
        + "\nVolume Atual: " + volume;
     
  }

    
    
}
/*Crie uma classe Televisao com métodos que podem controlar o volume e trocar os canais da televisão.
 A TV só funciona ligada e deve ter limites de volume e canais. Os canais ao chegar no último volta para o primeiro. 
 Crie os seguintes controles: aumentar ou diminuir a potência do volume de som em uma unidade de cada vez; 
 aumentar e diminuir o número do canal em uma unidade trocar para um canal indicado ou subir um canal caso não seja informado o canal; 
 consultar o valor do volume de som e o canal selecionado. Crie dois construtores para a TV, um que recebe apenas a marcad da TV e outro que recebe a marca, 
 quantidade de canais e volume máximo. Crie o método toString que mostrará a marca da TV, o volume e o canal atual. 
 Crie menu para interagir com a TV. Utilize métodos Get e Set.*/