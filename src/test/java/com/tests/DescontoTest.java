package com.tests;

import com.tests.methods.Desconto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DescontoTest {
    @Test
    public void calcularDescontoTest(){
        Desconto desconto = new Desconto();

        double descontoDe100 = desconto.calcularDesconto(100,10);
        assertEquals(90.0, descontoDe100, "O desconto de 100 com 10% está correto!");
    }
}