public class Pessoa {
   String nome , dataN;
   int idade; 
   
   //Metodo Construtor
   Pessoa(String nome,String dataN,int idade){
      this.nome = nome;
      this.dataN = dataN;
      this.idade = idade;

   }
   void registro(String nome,String dataN,int idade){
      //Realiza Registro do aluno
   }

   void escolhaEvento(String nomeEvento,String localEvento,String dataEvento,int opcao){
      //O aluno (usuario) escolhe atraves da variavel opcao o evento desejado
   }

   void confirmarEvento(String nomeEvento,boolean confirmarEvento){
      //O aluno (usuario) confirma o evento atraves de de sua escolhaEvento
   }
}
