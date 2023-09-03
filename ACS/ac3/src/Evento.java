public class Evento {
    String nome,data,local;
    int nMaxP;
    
    //Metodo Construtor 

    Evento(String nome,String data,String local,int nMaxP){
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.nMaxP = nMaxP;

    }

    void anuncioEvento(String nomeEvento,String data,String local){
        //Anunciar o Evento no site/app
    }
    void anuncioEventoFuturo(String nomeEvento){
        //Anunciar o Evento no site/app futuro mas sem informacoes apenas o nome
    }
    
}
