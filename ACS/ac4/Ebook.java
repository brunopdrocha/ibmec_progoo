
public class Ebook   {
    String TipoArquivo, nome, autor;
    
    public Ebook(String nome,String autor,String TipoArquivo){
        this.nome = nome;
        this.autor = autor;
        this.TipoArquivo=TipoArquivo;
    }
    
    public void reservar(){
       // System.out.println("O livro "+nome+" foi reservado.");
        //reservar livro
    }

   
    public void cancelarReserva(){
       // System.out.println("O livro "+nome+" foi cancelado a reserva.");
    //Cancelar a reservar do livro
    }
}
