public class Trasmissao1 implements ITransmiteDados {
    @Override
    public void enviaJSON(){
        System.out.println("Enviaando .json");
    }

    @Override
    public String recebeMensagem(String protocolo){
        return "Recebida mensagem usando protocolo"+protocolo;
    }

}
