package com.example;

import java.util.ArrayList;
import java.util.List;

import com.example.Patron_Builder_Mascota.Mascota;
import com.example.ReservaBuilder.Reserva;

public class Usuario {

    private int id;
    private String nombre;
    private String correo;
    private String telefono;
    private List<Reserva> reservas= new ArrayList<>();
    private List<Mascota> mascotas= new ArrayList<>();

    public void crearReserva(Reserva reserva) {
        if (reserva == null) {
            return;
        }

        if (!this.reservas.contains(reserva)) {
            this.reservas.add(reserva);
            System.out.println("Reserva ID: " + reserva.getId() + " anadida al historial del usuario.");
        }
    }

    private void notificarUsuario(String mensaje) {
        System.out.println("[Notificación para " + this.nombre + "]: " + mensaje);
    }

    public void registrarMascota(Mascota mascota) {
        if (!this.mascotas.contains(mascota)) {
            this.mascotas.add(mascota);
            notificarUsuario("Mascota '" + mascota.getNombre() + "' registrada con éxito.");
        } else {
            notificarUsuario("La mascota ya se encuentra registrada.");
        }
}

    public void cancelarReserva(Reserva reserva) {
        if (this.reservas.contains(reserva)) {
            reserva.cancelar();
            notificarUsuario("La reserva ha sido cancelada desde su cuenta.");
        } else {
            notificarUsuario("Error: Esta reserva no le pertenece.");
        }
    }


    public void reportarIncidente(String descripcionIncidente) {
        if (descripcionIncidente == null || descripcionIncidente.trim().isEmpty()) {
            System.out.println("El reporte no puede estar vacío.");
            return;
        }

        System.out.println("Incidente reportado por " + this.nombre + ": " + descripcionIncidente);
    }

    public List<Reserva> consultarReservas() {
        return this.reservas;
    }

    public List<Mascota> getMascotas() {
        return this.mascotas;
    }

    public String getNombre() {
        return nombre;
    }
}
