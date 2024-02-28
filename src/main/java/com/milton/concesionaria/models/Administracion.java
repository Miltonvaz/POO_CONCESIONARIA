package com.milton.concesionaria.models;
import java.util.ArrayList;

public class Administracion {
    private ArrayList<Automovil>listaCarros = new ArrayList<>();
    private ArrayList<Vendedor>vendedors = new ArrayList<>();
    public boolean addCarros(Automovil auto){
        return listaCarros.add(auto);
    }
    public boolean addVendedor(Vendedor vendedor){
        return vendedors.add(vendedor);
    }
    public ArrayList<Automovil> getListaCarros() {
        return listaCarros;
    }
    public ArrayList<Vendedor> getVendedors() {
        return vendedors;
    }
    public void setListaCarros(ArrayList<Automovil> listaCarros) {
        this.listaCarros = listaCarros;
    }

    public void setVendedors(ArrayList<Vendedor> vendedors) {
        this.vendedors = vendedors;
    }

}
