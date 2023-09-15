package entidades.pesooas;

//IMPORTS
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import entidades.Salas.Endereco;

public abstract class Pessoa{
    //Atributos
    private String nome,cpf;
    private Endereco endereco;
    private LocalDate dataNascimento;

    //Classe
    public Pessoa(String nome, String cpf, Endereco endereco, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }


    public String getDataNascimento() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
        return dataNascimento.format(formato);

    }
    @Override
    public String toString() {
        return 
            " Nome='" + this.nome + "'" +
            ", CPF='" + this.cpf + "'" +
            ", Endereco='" + this.endereco + "'" +
            ", DataNascimento='" + this.getDataNascimento() + "'" 
            ;
    }

    
    }//Fim classe Pessoa

