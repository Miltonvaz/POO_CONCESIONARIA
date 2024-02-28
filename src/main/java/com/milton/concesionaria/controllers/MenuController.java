package com.milton.concesionaria.controllers;
import java.net.URL;
import java.util.ResourceBundle;

import com.milton.concesionaria.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MenuController {
        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private Button bttonGerente;

        @FXML
        private Button bttonEmpleado;

        @FXML
        void bttonEmpleado(MouseEvent event) {
                HelloApplication.newStage("menuEmpleado-view","App - menu Empleado");
        }

        @FXML
        void bttonGerente(MouseEvent event) {
                HelloApplication.newStage("menuGerente-view","App - menu Empleado");
        }

        @FXML
        void initialize() {
        }

    public void init(Stage stageRoot) {
    }
}


