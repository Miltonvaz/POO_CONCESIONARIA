package com.milton.concesionaria.controllers;


import java.net.URL;
import java.util.ResourceBundle;

import com.milton.concesionaria.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class MenuGerenteController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button bttonAdd;

    @FXML
    private Button bttonAddVend;

    @FXML
    private Button bttonVer;

    @FXML
    void bttonAdd(MouseEvent event) {
        HelloApplication.newStage("datoauto-view","App - menu Empleado");
    }

    @FXML
    void bttonAddVend(MouseEvent event) {
        HelloApplication.newStage("empleados-view","App - menu Empleado");
    }

    @FXML
    void bttonVer(MouseEvent event) {
        HelloApplication.newStage("seeCars-view","App - menu Empleado");
    }

    @FXML
    void initialize() {
    }
}
