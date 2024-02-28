package com.milton.concesionaria.models;

import java.util.ArrayList;

public class Gestion {
    private ArrayList<Citas> listasCitas = new ArrayList<>();
    private ArrayList<Cliente> listClient = new ArrayList<>();

    public boolean addCitas(Citas cita){
        return listasCitas.add(cita);
    }
    public boolean addClient(Cliente cliente){
        return listClient.add(cliente);
    }

    public ArrayList<Citas> getListasCitas() {
        return listasCitas;
    }

    public void setListasCitas(ArrayList<Citas> listasCitas) {
        this.listasCitas = listasCitas;
    }

    public ArrayList<Cliente> getListClient() {
        return listClient;
    }

    public void setListClient(ArrayList<Cliente> listClient) {
        this.listClient = listClient;
    }
}
