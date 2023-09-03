public  class LivroFisico {
    String nome ,autor;
    boolean reservado,emprestado;


      // Construtor padrão
      public LivroFisico() {
        this.nome = "";
        this.autor = "";
        this.reservado = true;
        this.emprestado = false;

    }

    public LivroFisico(String nome,String autor) {

        this.nome=nome;
        this.autor = autor;   
        this.reservado=true;
        this.emprestado =false;
    }


    public void emprestar() {
        // Emprestar livro e informar caso o livro já esteja emprestado
        if (reservado==true) {
            System.out.println("O livro precisa ser RESERVADO PRIMEIRO");
        } else if (emprestado==true) {
            System.out.println("O livro JÁ FOI EMPRESTADO");
        } else {
            emprestado = true;
            System.out.println("O livro " + nome + " do autor " + autor + " foi emprestado com sucesso");
        }
    }

  
    
    

    public void reservar(){
        //reservar o livro
       reservado = false;
       System.out.println("O livro "+nome+" do autor "+autor+" foi reservado com sucesso");
             
       

    }
    
    
    public void devolver(){
        //devolve o livro
        reservado = true;
        emprestado = false;
       System.out.println("O livro "+nome+" do autor "+autor+" foi devolvido com Sucesso");
    }
   
}

 
    
