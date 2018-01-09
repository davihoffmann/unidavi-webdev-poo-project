package br.com.davi.trabalho1;

import br.com.davi.trabalho1.model.Analista;
import org.junit.Test;

import org.junit.Assert;

public class AnalistaTest {

    @Test
	public void testAumentoSalario(){
        Analista analista = new Analista(1L, "Joao Paulo", 5200, 7);
		Assert.assertEquals("OI", 2548.0000000000005, analista.getAumentoSalario(), 0);
	}

}