import entidades.Jogador;
import entidades.pessoas.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1;
        Jogador j1 = new Jogador("Socha", "c2", "VASCO", "Unif1", 4);

        System.out.println(j1.exibePosicao());
        j1.movimenta(10, -5);
        System.out.println(j1.exibePosicao());
        
        //downCasting
        p1 = new Jogador("Carlos", "c3", "IBMEC", "unif1", 01);
        j1.falar();
        j1.movimenta(10, 0); // Corrigido a ordem de chamada dos métodos

    }
}
