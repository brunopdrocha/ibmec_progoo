package entidades.pessoas;

public class Tecnico extends Pessoa {
    Tecnico(String nome,String corpo){
        super(nome,corpo);

    }
    @Override
    public void falar(){
        System.out.println("Eu sou TECNICO");
    }
}
