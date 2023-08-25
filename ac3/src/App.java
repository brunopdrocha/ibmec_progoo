public class App {

   
    public static void main(String[] args) throws Exception {
       
        Evento evento1,evento2;
        Palestrante palestrante1;
        Pessoa p1;

        evento1 = new Evento("Lalu", "27/08/2023", "Barra da Tijuca", 5000);

        evento2 = new Evento("Festa Planet", "27/08/2023", "Jacarepagua", 10000);
        
        palestrante1 = new Palestrante("Shorts", "(21)99123-1965", "shorts@shorsts.com");

        p1 = new Pessoa("Surf", "13/02/2002", 21);

        System.out.println(evento1.nome);
        System.out.println(evento1.local);
        System.out.println(evento1.data);
        System.out.println(evento1.nMaxP);
        System.out.println("");

        System.out.println(evento2.nome);
        System.out.println(evento2.local);
        System.out.println(evento2.data);
        System.out.println(evento2.nMaxP);
        System.out.println("");

        System.out.println(palestrante1.nome);
        System.out.println(palestrante1.telefone);
        System.out.println(palestrante1.eMail);
        System.out.println("");

        System.out.println(p1.nome);
        System.out.println(p1.idade);
        System.out.println(p1.dataN);
    }
}
