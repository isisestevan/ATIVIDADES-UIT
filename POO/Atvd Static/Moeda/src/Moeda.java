public class Moeda {
    public static double cotacao=5.5;
    public static double converteparareal(double dollar){
        return (dollar*cotacao);
    }
    public static double converteparadollar(double real){
        return (real/cotacao);
    }
    

}
/*Crie uma classe moeda e métodos estáticos que convertem de real para dólar e 
de dólar para real baseados em atributos com valores das moedas da própria classe. 
Teste esta classe utilizando os métodos sem necessitar instanciar objetos.*/