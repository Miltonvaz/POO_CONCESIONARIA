package com.milton.concesionaria.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.milton.concesionaria.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class MenuEmpleadoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button bttonAddCita;

    @FXML
    private Button bttonVerCita;

    @FXML
    void bttonAddCita(MouseEvent event) {
        HelloApplication.newStage("cita-view","App - menu Empleado");
    }

    @FXML
    void bttonVerCita(MouseEvent event) {
        HelloApplication.newStage("verCitas-view","App - menu Empleado");
    }

    @FXML
    void initialize() {


    }
}
