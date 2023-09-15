package entidades.pesooas;

import java.time.LocalDate;

import entidades.Procedimentos.PlanoSaude;
import entidades.Salas.Endereco;

public class Paciente extends Pessoa {
   public PlanoSaude plano;

    public Paciente(String nome,String cpf,Endereco endereco,LocalDate dataNascimento){
        super(nome, cpf, endereco, dataNascimento);
        this.plano = new PlanoSaude();
    }

    @Override
    public String toString(){
        return "Paciente "+super.toString() + "\n"+
        "Plano de Saude" + this.plano; 
    }
}//Fim classe Paciente
