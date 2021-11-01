package com.company;

import java.util.Random;
import java.util.Scanner;

public class Admin {

    private String Nombre;
    private String especialidad;
    private String Apellido;

    //Constructor alternativo
    public Admin(String Nombre, String especialidad, String Apellido){
        this.Nombre = Nombre;
        this.especialidad = especialidad;
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }


    public String GenerarIdentificador(){
        String identificador;
        String extraerN=" ";
        String extraerE= " ";
        String extraerA= " ";

        extraerN = getNombre().substring(0,3); //Primeras 3 letras del nombre
        extraerE = getEspecialidad().substring(0,2); //Primeras 2 letras de la especialidad
        extraerA = getApellido().substring(0,2); //Primeras 2 letras de la especialidad
        Random Aleatorio = new Random(); //Obtener 2 números randoms
        int nums= 10 + Aleatorio.nextInt(99);
        Integer.toString(nums);

        identificador = extraerN + nums + extraerE +extraerA ;

        return identificador;

    }

    public String GenerarContrasena(){
        Scanner sc = new Scanner(System.in);
        String contrasena;
        System.out.println("Favor de Ingresar su contraseña: ");
        contrasena = sc.nextLine();
        return contrasena;
    }

    public String  CreaciónUsuario(){
        return "0";
    }

    public String  BajaUsuario(){
        return "0";
    }

    public String  CambioContrasena(){
        return "0";
    }
}
