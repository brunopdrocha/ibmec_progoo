package aula03;

public class App {
    public static void main(String[] args) {
       Jogador jog1,jog2;
       
       jog1 = new Jogador();
       jog1.nome  = "Messi";
       jog1.posx= 15.2;
       jog1.posy= 25.4;
       jog1.numCamisa= 10;
       jog1.time = "Clube de Regatas Vasco da Gama";

       jog2 = new Jogador();
       jog2.nome= "Messi";
       jog2.posx= 15.2;
       jog2.posy= 25.4;
       jog2.numCamisa= 10;
       jog2.time = "Clube de Regatas Vasco da Gama";


       System.out.println(jog1.nome);
       System.out.println(jog1.posx+"----"+jog1.posy);
       jog1.andar(10,20);
       System.out.println(jog1.posx+"----"+jog1.posy);

       System.out.println(jog1);
       System.out.println(jog2);
       
       Jogador jog3 = new Jogador("Pedrocha", "Vasco da Gama", 1.83, 94, "Lateral");
            System.out.println(jog3.nome);
            System.out.println(jog3.velocidade);
            jog3.mudarTime(1,"Real Madrid");
            System.out.println(jog3.time);
    }


    
}
