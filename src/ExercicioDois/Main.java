package ExercicioDois;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario(1);
        Funcionario funcionario2 = new Funcionario(2);
        Funcionario funcionario3 = new Funcionario(3);

        funcionario1.setNome("Vitoria");
        LocalDate dataExemplo1 = LocalDate.of(2023, 05,18);
        funcionario1.setDatedeAdm(dataExemplo1);
        funcionario1.setSalario(1230.00);

        System.out.println(funcionario1.getIdent());
        System.out.println(funcionario2.getIdent());
        System.out.println(funcionario3.getIdent());



        funcionario2.setNome("Maria");
        LocalDate dataExemplo2 = LocalDate.of(2021, 05,18);
        funcionario2.setDatedeAdm(dataExemplo2);
        funcionario2.setSalario(1500.00);



        funcionario3.setNome("Roberto");
        LocalDate dataExemplo3 = LocalDate.of(2023, 01,01);
        funcionario3.setDatedeAdm(dataExemplo3);
        funcionario3.setSalario(2000);


    }
}

