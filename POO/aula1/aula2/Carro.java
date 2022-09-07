package aula2;

public class Carro { 
    
    private boolean chave;
    private int vel_atual;
    private double combustivel;
    private double capacidade;
   
    

    
    public int get_vel_atual(){
        return vel_atual;
    }
    public void acelerar() {
        if(vel_atual>0){
        vel_atual = vel_atual + 1;
        }else 
        System.out.println("Não é possível acelerar");
        }
        public void frear() {
        vel_atual = vel_atual - 1;
        } 
   
    
    public void liga(){
        chave = true;
    }

    public void desliga(){
        chave = false;
    } 
    public void setCapacidade(double lts){
        capacidade = lts; 
    }
    
    
    public void abastecer(double litros){
        if(capacidade < combustivel + litros ){
        combustivel += litros;
        }
    } 

    public void show_car(){
        System.out.println("Velocidade atual:"+vel_atual);
        System.out.println("Combustivel:"+combustivel);
        if(chave = true){
            System.out.println("Carro Ligado");
        }else{
            System.out.println("Carro Desligado");
        }
    }
    
}
