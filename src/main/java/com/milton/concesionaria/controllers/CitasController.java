package com.milton.concesionaria.controllers;

import java.net.URL;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.milton.concesionaria.HelloApplication;
import com.milton.concesionaria.models.Citas;
import com.milton.concesionaria.models.Cliente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class CitasController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button bttonAdd;

    @FXML
    private Button bttonCancelar;

    @FXML
    private TextField textNombre;

    @FXML
    private TextField textApellido;

    @FXML
    private TextField textTelefono;

    @FXML
    private TextField textNumero;

    @FXML
    private TextField textCarro;

    @FXML
    private DatePicker textFecha;

    @FXML
    private TextField textHora;
    private ArrayList<Citas> listaCitas = new ArrayList<>();

    @FXML
    void bttonAdd(ActionEvent event) {
        try {
            Citas cita = new Citas();
            if (textFecha.getValue() != null){
                cita.setFechaHora(LocalDateTime.of(textFecha.getValue(), LocalTime.of(Integer.parseInt(textHora.getText()),0)));
            }
            Cliente cliente = new Cliente();
            cliente.setNombre(textNombre.getText());
            cliente.setApellido(textApellido.getText());
            cliente.setNumTelefonico(Integer.parseInt(textTelefono.getText()));
            cliente.setCorreoElectronico(textNumero.getText());

            cita.setHour(Integer.parseInt(textHora.getText()));
            cita.setClient(cliente);

            HelloApplication.getGestion().addCitas(cita);
            HelloApplication.getGestion().addClient(cliente);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
                String formattedDateTime = cita.getFechaHora().format(formatter);

                showAlert("Cita Agregada","Cita confirmada","La cita se ha agregado correctamente.\nFecha y hora" + formattedDateTime);
                limpiarCampos();
        }catch (NumberFormatException e){
            showAlert("Error en la entrada de datos", "Error","Por favor,ingrese numeros validos en los campos numéricos");

        }

    }

    @FXML
    void bttonCancelar(ActionEvent event) {
        HelloApplication.getStageView().close();
    }
    private void limpiarCampos(){
        textNombre.clear();
        textApellido.clear();
        textTelefono.clear();
        textNumero.clear();
        textHora.clear();
    }
    private void showAlert(String header, String title, String content){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(header);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.showAndWait();
    }
    public ArrayList<Citas> getListaCitas(){
        return listaCitas;
    }

    @FXML
    void initialize() {
        assert bttonAdd != null : "fx:id=\"bttonAdd\" was not injected: check your FXML file 'cita-view.fxml'.";
        assert bttonCancelar != null : "fx:id=\"bttonCancelar\" was not injected: check your FXML file 'cita-view.fxml'.";
        assert textNombre != null : "fx:id=\"textNombre\" was not injected: check your FXML file 'cita-view.fxml'.";
        assert textApellido != null : "fx:id=\"textApellido\" was not injected: check your FXML file 'cita-view.fxml'.";
        assert textTelefono != null : "fx:id=\"textTelefono\" was not injected: check your FXML file 'cita-view.fxml'.";
        assert textNumero != null : "fx:id=\"textNumero\" was not injected: check your FXML file 'cita-view.fxml'.";
        assert textCarro != null : "fx:id=\"textCarro\" was not injected: check your FXML file 'cita-view.fxml'.";
        assert textFecha != null : "fx:id=\"textFecha\" was not injected: check your FXML file 'cita-view.fxml'.";
        assert textHora != null : "fx:id=\"textHora\" was not injected: check your FXML file 'cita-view.fxml'.";

    }
}
