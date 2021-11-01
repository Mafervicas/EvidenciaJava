package com.company;

public class Cita {
    private String paciente, doctor,fecha;

    public Cita(String paciente, String doctor, String fecha) {
        this.paciente = paciente;
        this.doctor = doctor;
        this.fecha = fecha;
    }

    public void Imprimir(){
        System.out.println("La cita del paciente "+paciente+" con el doctor "+ doctor+ " es el  "+fecha);
    }
}
