package com.milton.concesionaria.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.milton.concesionaria.HelloApplication;
import com.milton.concesionaria.models.Administracion;
import com.milton.concesionaria.models.Automovil;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

public class SeeCarsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button bttonVer;

    @FXML
    private Button bttonSalir;
    @FXML
    private ListView<String> listCars;

    @FXML
    void bttonSalir(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

    @FXML
    void bttonVer(MouseEvent event) {
        Administracion admon = HelloApplication.getAdmin();
        for (Automovil carro : admon.getListaCarros()){
            listCars.getItems().add(carro.toString());
        }
    }

    @FXML
    void initialize() {

    }
}
