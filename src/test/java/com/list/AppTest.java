package com.list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class AppTest {

    private GestorDiasSemana gestor; 

    @BeforeEach
    void setUp() {
        gestor = new GestorDiasSemana();
        gestor.crearListaDias();
    }

    @Test
    void testCrearListaDias() {
        List<String> dias = gestor.obtenerDiasSemana();
        assertEquals(7, dias.size());
        assertTrue(dias.contains("Lunes"));
    }

    @Test
    void testObtenerDiasSemana() {
        List<String> dias = gestor.obtenerDiasSemana();
        assertNotNull(dias); 
        assertEquals(7, dias.size());
    }

    @Test
    void testObtenerLargoLista() {
        assertEquals(7, gestor.obtenerLargoLista());
    }


    @Test
    void testEliminarDia() {
        assertTrue(gestor.eliminarDia("Lunes"));
        assertEquals(6, gestor.obtenerLargoLista());
        assertFalse(gestor.existeDia("Lunes")); 
    }

  
    @Test
    void testObtenerDiaPorIndice() {
        assertEquals("Lunes", gestor.obtenerDiaPorIndice(0));
        assertEquals("Domingo", gestor.obtenerDiaPorIndice(6));
        assertNull(gestor.obtenerDiaPorIndice(10));
    }


    @Test
    void testExisteDia() {
        assertTrue(gestor.existeDia("Sábado"));
    }

 
    @Test
    void testOrdenarDiasAlfabeticamente() {
        gestor.ordenarDiasAlfabeticamente();
        List<String> dias = gestor.obtenerDiasSemana();
        assertEquals("Domingo", dias.get(0));
        assertEquals("Viernes", dias.get(5));
    }


    @Test
    void testVaciarLista() {
        gestor.vaciarLista();
        assertEquals(0, gestor.obtenerLargoLista());
    }
}
