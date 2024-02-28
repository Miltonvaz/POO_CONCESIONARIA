package com.milton.concesionaria.controllers;
import java.net.URL;
import java.util.ResourceBundle;

import com.milton.concesionaria.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class DatosAutoController {
        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private Button bttondeport;

        @FXML
        private Button bttoncamio;

        @FXML
        private Button bttonsedan;

        @FXML
        void bttoncamio(MouseEvent event) {
                HelloApplication.newStage("camioneta-view","App - menu Camioneta");
        }

        @FXML
        void bttondeport(MouseEvent event) {
                HelloApplication.newStage("deportivo-view","App - Deportivo");
        }

        @FXML
        void bttonsedan(MouseEvent event) {
                HelloApplication.newStage("sedan-view","App - menu Sedan");
        }

        @FXML
        void initialize() {
        }
    }


