package com.tests;

import com.tests.methods.VerificarParidade;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VerificarParidadeTest {
    @Test
    public void verificarParidadeTest(){
        VerificarParidade vp = new VerificarParidade();
        String resultado = vp.parOuImpar(1);

        assertLinesMatch("impar".lines(), resultado.lines(), "Sim!");
    }
}