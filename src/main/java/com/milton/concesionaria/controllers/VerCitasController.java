package com.milton.concesionaria.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.milton.concesionaria.HelloApplication;
import com.milton.concesionaria.models.Citas;
import com.milton.concesionaria.models.Gestion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

public class VerCitasController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button bttonVer;

    @FXML
    private Button bttonSalir;

    @FXML
    private ListView<String> listCitas;

    @FXML
    void bttonSalir(MouseEvent event) {
        HelloApplication.getStageView().close();
    }


    @FXML
    void bttonVer(ActionEvent event) {

            listCitas.getItems().clear();

            Gestion gest = HelloApplication.getGestion();
            for (Citas cita : gest.getListasCitas()) {
                listCitas.getItems().add(cita.toString());
            }

    }

    @FXML
    void initialize() {
    }

}

