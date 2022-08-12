package br.com.letscode.bb.solid.ocp.callcenter.funcionarios;

import java.math.BigDecimal;

public class ReajustadorLimiteSalarioAnualCoordenador implements ReajustadorLimiteSalarioAnual{
    @Override
    public void reajusteAnualSalario(Funcionario funcionario) {
        BigDecimal salario = funcionario.getSalario();
        funcionario.setSalario(
                salario.add(salario.multiply(new BigDecimal(0.10))));
    }
}
