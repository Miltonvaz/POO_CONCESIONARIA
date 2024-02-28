package com.milton.concesionaria.models;

public class Automovil {
    private String modelo;
    private String color;
    private int cilindros;
    private int precio;
    private int annio;
    private String noMotor;

    public Automovil(String modelo, String color, int cilindros, int precio, int annio, String noMotor) {
        this.modelo = modelo;
        this.color = color;
        this.cilindros = cilindros;
        this.precio = precio;
        this.annio = annio;
        this.noMotor = noMotor;
    }

    public Automovil() {
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindros=" + cilindros +
                ", precio=" + precio +
                ", annio=" + annio +
                ", noMotor='" + noMotor + '\'' +
                '}';
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public String getNoMotor() {
        return noMotor;
    }

    public void setNoMotor(String noMotor) {
        this.noMotor = noMotor;
    }
}
