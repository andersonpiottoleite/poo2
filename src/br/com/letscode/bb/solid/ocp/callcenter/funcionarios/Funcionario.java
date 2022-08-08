package br.com.letscode.bb.solid.ocp.callcenter.funcionarios;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Funcionario {

    //OCP:
    // Fechadas para alterações
    // Abertas para extensões

    private String nome;
    private String matricula;

    private BigDecimal salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", Salario=" + NumberFormat
                .getCurrencyInstance(new Locale("pt", "br"))
                .format(salario) +
                '}';
    }
}
