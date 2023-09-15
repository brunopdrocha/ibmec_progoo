//Imports
import java.time.LocalDate;
import entidades.Salas.Endereco;
import entidades.pesooas.Medico;
import entidades.pesooas.Paciente;

public class App {
    public static void main(String[] args) throws Exception {
      //Objeto Paciente 1
      Paciente p1 = new Paciente("Bruno","123456123-42",new Endereco(),LocalDate.of(2003,06,22));

      //Objeto Medico 1
      Medico m1 = new Medico("Paulo", "121231123-23",new Endereco() , LocalDate.of(1994,05,12), "123123/00");
      System.out.println(p1);

      System.out.println(m1);
    }
}
