package br.com.davi.trabalho1.model;

public class Suporte extends Funcionario {

    public Suporte(Long id, String nome, double salario, double notaAvaliacao) {
        super(id, nome, salario, notaAvaliacao);
    }

    @Override
    public double getAumentoSalario() {
        return this.getSalario() * (this.getNotaAvaliacao() * 0.05);
    }

}