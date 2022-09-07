import java.util.Random;


public class Celular{
   private String modelo;
   private double nivelBateria;
   private boolean ligado;
   private double som;
   private int idCel;
   Random random = new Random();
   public static int qtdidCel=0;
   
  


  public Celular(String modelo,double nivelBateria){
      setModelo(modelo);
      setNivelBateria(nivelBateria);
      qtdidCel++;
      idCel=qtdidCel;
  }
  public String getModelo(){
      return modelo;
  }

  public void setModelo(String modelo){
      this.modelo=modelo;
  } 

  public double getNivelBateria(){
      return nivelBateria;
  }

  public void setNivelBateria(double nivelBateria){
      this.nivelBateria=nivelBateria;
  }

  public double getSom(){
      return som;
  }

  public void setSom(double som){
      this.som=som;
  }

  public void ligar(){
      ligado = true;
  }

  public void desliga(){
      ligado = false;
  }

  public void carrega(){
      this.nivelBateria = 100;
  }

  public void aumentaSom(){
      this.som++;
  }

  public void abaixaSom(){
      this.som--;
  }
   /*Pedra + Papel = 3
     Pedra + Tesoura = 4
     Papel + Tesoura = 5*/
  public void jogar(int numero){
    if(ligado=true){
        int numramdom = random.nextInt(3);
     if(numero==1 && (numero+numramdom==3)) {
         System.out.println("Papel ganhou");
     }
      else 
         if(numero==2 && (numero+numramdom==4)){
             System.out.println("Pedra ganhou");
         }else 
         if(numero==3 && (numero+numramdom==5)){
             System.out.println("Tesoura ganhou");
         }else     
           if(numero-numramdom==0 || numramdom-numero==0){
               System.out.println("Empate");
           }
         
         else{
             System.out.println("Você Perdeu");
         }
     }
     nivelBateria--;
    }
  }

 



  

