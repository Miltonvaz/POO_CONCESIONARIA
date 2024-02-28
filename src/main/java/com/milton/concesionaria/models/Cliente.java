package com.milton.concesionaria.models;

public class Cliente {
    private String nombre;
    private String apellido;
    private long numTelefonico;
    private String correoElectronico;

    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getNumTelefonico() {
        return numTelefonico;
    }

    public void setNumTelefonico(long numTelefonico) {
        this.numTelefonico = numTelefonico;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numTelefonico=" + numTelefonico +
                ", correoElectronico='" + correoElectronico + '\'' +
                '}';
    }
}
