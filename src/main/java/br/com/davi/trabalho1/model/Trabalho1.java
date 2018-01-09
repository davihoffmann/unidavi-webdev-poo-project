package br.com.davi.trabalho1.model;

import java.util.logging.Logger;

public class Trabalho1 {

    private static final Logger logger = Logger.getLogger(Trabalho1.class.getName());

    public static void main(String[] args) {

        Analista analista = new Analista(1L, "Joao Paulo", 5200, 7);
        logger.info("========Analista==========");
        System.out.println(analista.getAumentoSalario());
        System.out.println(analista.getSalarioComAumento());
        logger.info("==========================");

        Programador programador = new Programador(2L, "Marcos", 3800, 6);
        logger.info("========Programador==========");
        System.out.println(programador.getAumentoSalario());
        System.out.println(programador.getSalarioComAumento());
        logger.info("==========================");

        Suporte suporte = new Suporte(3L, "Roberto", 2560, 8);
        logger.info("=========Suporte==========");
        System.out.println(suporte.getAumentoSalario());
        System.out.println(suporte.getSalarioComAumento());
        logger.info("==========================");
    }

}
