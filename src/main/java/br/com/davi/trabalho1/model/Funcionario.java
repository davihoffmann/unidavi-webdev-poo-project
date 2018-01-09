package br.com.davi.trabalho1.model;

public class Funcionario {

    private Long id;
    private String nome;
    private double salario;
    private double notaAvaliacao;

    protected Funcionario() {
    }

    protected Funcionario(Long id, String nome, double salario, double notaAvaliacao) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.notaAvaliacao = notaAvaliacao;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getNotaAvaliacao() {
        return notaAvaliacao;
    }

    public void setNotaAvaliacao(double notaAvaliacao) {
        this.notaAvaliacao = notaAvaliacao;
    }

    public double getAumentoSalario() {
        return this.getSalario() * (this.getNotaAvaliacao() * 0.02);
    }

    public double getSalarioComAumento() {
        return this.getSalario() + this.getAumentoSalario();
    }
}