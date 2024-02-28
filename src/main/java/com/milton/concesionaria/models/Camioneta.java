package com.milton.concesionaria.models;

public class Camioneta extends Automovil {
    private String todoTerreno;
    private int capacidadCarga;

    public Camioneta(String modelo, String color, int cilindros, int precio, int annio, String noMotor, String todoTerreno, int capacidadCarga) {
        super(modelo, color, cilindros, precio, annio, noMotor);
        this.todoTerreno = todoTerreno;
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return super.toString() + "Camioneta{" +
                "todoTerreno='" + todoTerreno + '\'' +
                ", capacidadCarga=" + capacidadCarga +
                '}';
    }
}
