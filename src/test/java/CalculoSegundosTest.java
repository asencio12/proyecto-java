package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gt.edu.umes.proy.calculo.LogicaDelNegocio;

class CalculoSegundosTest {

    @Test
    void parametroConLetrasLanzaExcepcion() {
        LogicaDelNegocio logica = new LogicaDelNegocio();
        assertThrows(IllegalArgumentException.class, () ->
            logica.calcularSegundos(new String[] {"1", "abc", "6", "20", "1"}));
    }

    @Test
    void calculaBienLosSegundos() {
        LogicaDelNegocio logica = new LogicaDelNegocio();
        assertEquals(4996860L,
            logica.calcularSegundos(new String[] {"1", "3", "6", "20", "1"}));
    }
}