package br.com.davi.trabalho1.model;

public class Programador extends Funcionario {

    public Programador(Long id, String nome, double salario, double notaAvaliacao) {
        super(id, nome, salario, notaAvaliacao);
    }

    public double getAumentoSalario() {
        return this.getSalario() * (this.getNotaAvaliacao() * 0.07);
    }

}