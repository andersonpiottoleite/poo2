package br.com.letscode.bb.solid.ocp.callcenter.funcionarios;

import java.math.BigDecimal;

public class SalarioService {

    public void reajusteAnualSalario(Funcionario funcionario){
        BigDecimal salario = funcionario.getSalario();

        if(funcionario instanceof Atendente){
            funcionario.setSalario(
                    salario.add(salario.multiply(new BigDecimal(0.02))));

        } else if(funcionario instanceof Supervisor){
            funcionario.setSalario(
                    salario.add(salario.multiply(new BigDecimal(0.05))));

        } else if(funcionario instanceof Coordenador){
            funcionario.setSalario(
                    salario.add(salario.multiply(new BigDecimal(0.10))));
        }

    }
}
