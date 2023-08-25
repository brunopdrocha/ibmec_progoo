package aula03;

public class Jogador {
    double posx,posy;
    double altura,peso;
    int numCamisa;
    double velocidade;
    String time;
    String nome;
    String posicionamento;


    //Metodo Construtor
    Jogador(){
        this.time ="Sem time";
    }
    //Metodo Construtor Sobrecarregado
    Jogador(String nome,String time, double altura,double peso,String posicionamento){

        this.nome = nome;
        this.time = time;
        this.altura= altura;
        this.peso = 60;
        this.velocidade = 0;
        this.posicionamento = posicionamento;
        if(posicionamento.equals("goleiro")){
            this.posx = 50;
            this.posy = 0;
        }

    }


    void andar(double novaPosx,double novaPosy){
        this.posx= novaPosx;
        this.posy= novaPosy;
    }
    void mudarTime(String novoTime){
        this.time=novoTime;
    }

    void mudarTime(int histMudanca,String novoTime){
    System.out.println("Mudou de time!, Esta e a mudanca "+histMudanca);
    this.time = novoTime;
}
}
