public class Ebook extends LivroFisico   {
    String TipoArquivo;
    boolean reservado;
    
    public Ebook(String nome, String autor ,String TipoArquivo){
        super(nome, autor) ;
        this.TipoArquivo=TipoArquivo;
        this.reservado = false;
    }
    
    public void reservar(){
        reservado=true;    
       System.out.println("O livro "+nome+" do autor "+autor+ "com tipo "+TipoArquivo+" foi reservado.");
        //reservar livro
    }

   
    public void cancelarReserva(){
    
    System.out.println("O livro "+nome+"do autor "+autor+"com tipo "+TipoArquivo+" foi cancelado a reserva.");
    //Cancelar a reservar do livro
    }
}
