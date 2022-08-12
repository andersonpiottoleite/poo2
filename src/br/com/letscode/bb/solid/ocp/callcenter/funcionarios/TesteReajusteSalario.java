package br.com.letscode.bb.solid.ocp.callcenter.funcionarios;

import java.math.BigDecimal;

public class TesteReajusteSalario {
    public static void main(String[] args) {
        Funcionario atendente  = new Atendente();
        atendente.setNome("Francisco");
        atendente.setMatricula("ABC1");
        atendente.setSalario(new BigDecimal(2000));

        Funcionario supervisor  = new Supervisor();
        supervisor.setNome("Maxwell");
        supervisor.setMatricula("ABC2");
        supervisor.setSalario(new BigDecimal(4000));

        Funcionario coordenador  = new Coordenador();
        coordenador.setNome("Tais");
        coordenador.setMatricula("ABC3");
        coordenador.setSalario(new BigDecimal(6000));

        SalarioService salarioService = new SalarioService();
        /*salarioService.reajusteAnualSalario(atendente);
        salarioService.reajusteAnualSalario(supervisor);
        salarioService.reajusteAnualSalario(coordenador);

        System.out.println(atendente);
        System.out.println(supervisor);
        System.out.println(coordenador);*/

        salarioService.reajusteAnualSalario(atendente, new ReajustadorLimiteSalarioAnualAtendente());
        salarioService.reajusteAnualSalario(supervisor, new ReajustadorLimiteSalarioAnualSupervisor());
        salarioService.reajusteAnualSalario(coordenador, new ReajustadorLimiteSalarioAnualCoordenador());

        System.out.println(atendente);
        System.out.println(supervisor);
        System.out.println(coordenador);

    }
}
