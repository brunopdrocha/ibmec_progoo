public interface ITransmiteDados {
    
    //Metodos em interface sao abstratos por padrao 
    //Entao nao eh preciso explicitar.

    void enviaJSON();
    String recebeMensagem(String protocolo);
    
}
