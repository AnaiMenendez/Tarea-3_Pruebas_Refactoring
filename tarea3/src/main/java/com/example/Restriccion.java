package com.example;

import com.example.Patron_Builder_Mascota.Mascota;

public abstract class Restriccion {
    private int id;
    private String descripcion;

    public Restriccion(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public abstract boolean validar(Mascota mascota);
}
