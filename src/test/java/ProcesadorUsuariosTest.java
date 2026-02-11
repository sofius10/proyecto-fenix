package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;

public class ProcesadorUsuariosTest {

    @Test
    void testProcesarLista() {

        ProcesadorUsuarios p = new ProcesadorUsuarios();

        List<String> usuarios = List.of(
                "Ana:1",
                "Juan:2"
        );

        String resultado = p.procesarLista(usuarios);

        assertEquals("Admins: Ana, | Invitados: Juan, ", resultado);
    }
}
