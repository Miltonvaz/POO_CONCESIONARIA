package com.milton.concesionaria.models;

public class Deportivo extends Automovil {
    private int velocidadMax;
    private int caballosDeFuerza;



    public Deportivo(String modelo, String color, int cilindros, int precio, int annio, String noMotor, int velocidadMax, int caballosDeFuerza) {
        super(modelo, color, cilindros, precio, annio, noMotor);
        this.velocidadMax = velocidadMax;
        this.caballosDeFuerza = caballosDeFuerza;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public int getCaballosDeFuerza() {
        return caballosDeFuerza;
    }

    public void setCaballosDeFuerza(int caballosDeFuerza) {
        this.caballosDeFuerza = caballosDeFuerza;
    }

    @Override
    public String toString() {
        return super.toString() + "Deportivo{" +
                "velocidadMax=" + velocidadMax +
                ", caballosDeFuerza=" + caballosDeFuerza +
                '}';
    }
}
