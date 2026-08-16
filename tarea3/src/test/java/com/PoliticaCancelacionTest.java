package com;

import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.PoliticaCancelacion;

public class PoliticaCancelacionTest {
    @Test
    @DisplayName("PU-22 - Debe rechazar cancelación con menos de 24 horas")
    void esCancelable() throws Exception {
//Se crea un objeto politicaCancelacion para pruebas
//Antes PoliticaCancelacion(24)
//Ahora PoliticaCancelacion(24,0.0)
        PoliticaCancelacion politica =
                new PoliticaCancelacion(24,0.0);

        assertFalse(
                politica.esCancelable(23)
        );
    }
}
