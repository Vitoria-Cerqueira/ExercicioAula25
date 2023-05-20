package ExercicioDois;

import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private LocalDate datedeAdm;
    private double salario;
    static int identificador;
    private int ident;

    public Funcionario(int identificador){
        this.ident = identificador;
    }
    public int getIdent(){
        return ident;
    }
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

//    public localDate getDatedeAdm(){
//        return datedeAdm;
//    }

    public void setDatedeAdm(LocalDate data){
        LocalDate dataAtual = LocalDate.now();
        if(data.isAfter(dataAtual)){
            System.out.println("Data futura não permitida");
            System.exit(0);
        }
        this.datedeAdm = data;
    }
    public double getSalario(){
        return salario;
    }
    public void setSalario( double sal){
        if(sal<700){
            System.out.println("Valor de salário não permitido");
            System.exit(0);
        }
        this.salario =  sal;
    }


    public void setIdentificador(int id){
        identificador = id;
    }
}


