package br.com.davi.trabalho1.model;

public class Trabalho1 {

    public static void main(String[] args) {
        Analista analista = new Analista(1L, "Joao Paulo", 5200, 7);
        System.out.println("========Analista==========");
        System.out.println(analista.getAumentoSalario());
        System.out.println(analista.getSalarioComAumento());
        System.out.println("==========================");

        Programador programador = new Programador(2L, "Marcos", 3800, 6);
        System.out.println("========Programador==========");
        System.out.println(programador.getAumentoSalario());
        System.out.println(programador.getSalarioComAumento());
        System.out.println("==========================");

        Suporte suporte = new Suporte(3L, "Roberto", 2560, 8);
        System.out.println("=========Suporte==========");
        System.out.println(suporte.getAumentoSalario());
        System.out.println(suporte.getSalarioComAumento());
        System.out.println("==========================");
    }

}
