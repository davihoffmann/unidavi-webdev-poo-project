package br.com.davi.trabalho1.model;

public class Analista extends Funcionario {

    public Analista(Long id, String nome, double salario, double notaAvaliacao) {
        super(id, nome, salario, notaAvaliacao);
    }

    @Override
    public double getAumentoSalario() {
        return this.getSalario() * (this.getNotaAvaliacao() * 0.07);
    }

}