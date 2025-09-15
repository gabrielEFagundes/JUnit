package com.tests;

import com.tests.methods.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    @Test
    public void somarTest(){
        Calculadora calculadora = new Calculadora();
        int result = calculadora.somar(2, 2);

        assertEquals(4, result, "Funciona!");
    }
}