public class Palestrante {
    String nome,telefone,eMail;
    
    Palestrante(String nome){
        this.nome=nome;
    }

    Palestrante(String nome, String telefone){
        this.nome =nome;
        this.telefone =telefone;
    }

    Palestrante(String nome, String telefone,String eMail){
        this.nome = nome;
        this.telefone = telefone;
        this.eMail = eMail;
    }

    void proporEvento(String nomeEvento){
        // Apresentar um evento
        
        
    }
    void cancelarEvento(String nomeEvento,boolean EventoAtivo){
        //Cancelar Evento ativo
    }
    void ativarEvento(String nomeEvento,boolean EventoAtivo){
        //Ativa determinado  Evento 
    }
}
