package com.example;
import com.example.Patron_Builder_Mascota.Mascota;

public class RestriccionTamano extends Restriccion {
    private TamanoMascota tamanoPermitido;

    public RestriccionTamano(int id, String descripcion, TamanoMascota tamanoPermitido) {
        super(id, descripcion);
        this.tamanoPermitido = tamanoPermitido;
    }

    @Override
    public boolean validar(Mascota mascota) {
        if (mascota == null || mascota.getTamano() == null) return false;
        return mascota.getTamano() == this.tamanoPermitido;
    }
}