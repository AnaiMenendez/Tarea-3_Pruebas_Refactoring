package com.example;
import com.example.Patron_Builder_Mascota.Mascota;

public class RestriccionRaza extends Restriccion {
    private String razaNoPermitida;

    public RestriccionRaza(int id, String descripcion, String razaNoPermitida) {
        super(id, descripcion);
        this.razaNoPermitida = razaNoPermitida;
    }

    @Override
    public boolean validar(Mascota mascota) {
        if (mascota == null || mascota.getRaza() == null) return false;
        return !mascota.getRaza().equalsIgnoreCase(this.razaNoPermitida);
    }
}