package com.example;


import java.util.List;

public class ProcesadorUsuarios {

    private static final int ROL_ADMIN = 1;
    private static final int ROL_INVITADO = 2;

    public String procesarLista(List<String> usuarios) {

        StringBuilder admins = new StringBuilder();
        StringBuilder invitados = new StringBuilder();

        for (String usuario : usuarios) {
            String[] partes = usuario.split(":");

            if (partes.length == 2) {
                String nombre = partes[0];
                int rol = Integer.parseInt(partes[1]);

                if (rol == ROL_ADMIN) {
                    admins.append(nombre).append(", ");
                } else if (rol == ROL_INVITADO) {
                    invitados.append(nombre).append(", ");
                }
            }
        }

        return "Admins: " + admins + "| Invitados: " + invitados;
    }
}
