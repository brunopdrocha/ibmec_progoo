package entidades.pesooas;

import java.time.LocalDate;

import entidades.Salas.Consultorio;
import entidades.Salas.Endereco;
import entidades.Salas.Especialidade;


public class Medico extends Pessoa {
    private Especialidade especialidade;
    private Consultorio consultorio;
    private String crm;
    private double valorHora;
   

    public Medico(String nome,String cpf,Endereco endereco,LocalDate dataNascimento,String crm){
        super(nome, cpf, endereco, dataNascimento);
        this.crm = crm;   
    }


    public void defineHora(double valor){
        this.valorHora = valor;
    }
    public double calculaAtendimento(int numHoras){
        return this.valorHora *numHoras;
    }
    public void alocaConsultorio(Consultorio consultorio){
        this.consultorio = consultorio;
    }

    public void cadastraEspecialidade(Especialidade especialidade){
        this.especialidade = especialidade;
    }

    @Override
    public String toString(){
        return "Medico "+super.toString() + "\n"+
        "CRM" + this.crm + "\n"+ 
        "Especialidade" + this.especialidade + "\n"+ 
        "Consultorio" + this.consultorio +"\n"+
        "Valor por hora R$ " + this.valorHora; 
    }

}
