package com.tests;

import com.tests.methods.Vogais;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VogaisTest {
    @Test
    public void contarTest(){
        Vogais v = new Vogais();
        int qtdVogais = v.contar("Banana");

        assertEquals(3, qtdVogais, "Sim!");
    }
}