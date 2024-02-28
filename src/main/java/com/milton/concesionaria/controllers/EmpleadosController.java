package com.milton.concesionaria.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.milton.concesionaria.HelloApplication;
import com.milton.concesionaria.models.Administracion;
import com.milton.concesionaria.models.Vendedor;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class EmpleadosController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textNombre;

    @FXML
    private TextField textApellido;

    @FXML
    private TextField textId;

    @FXML
    private TextField textEdad;

    @FXML
    private ListView<String> listVendedor;

    @FXML
    private Button bttonAdd;

    @FXML
    private Button bttonCancelar;

    @FXML
    private Button bttonMostrar;

    @FXML
    void bttonAdd(MouseEvent event) {
        try {
            String nombre = textNombre.getText().trim();
            String apellido = textApellido.getText().trim();
            int edad = Integer.parseInt(textEdad.getText().trim());
            int id = Integer.parseInt(textId.getText().trim());

            Vendedor vendedor = new Vendedor(nombre, apellido, edad, id);
            HelloApplication.getAdmin().addVendedor(vendedor);
            showAlert("Vendedor Agregado", "Confirmación", "El vendedor se ha agregado correctamente.", Alert.AlertType.INFORMATION);
            limpiarCampos();
        } catch (NumberFormatException e) {
            showAlert("Error", "Error al ingresar datos", "Ingrese datos válidos.", Alert.AlertType.ERROR);
        }
    }

    @FXML
    void bttonCancelar(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

    @FXML
    void bttonMostrar(MouseEvent event) {
        Administracion admin = HelloApplication.getAdmin();
        for (Vendedor vend : admin.getVendedors()){
            listVendedor.getItems().add(vend.toString());
        }
    }

    private void showAlert(String titulo, String encabezado, String contenido, Alert.AlertType tipo) {
        Alert alert = new Alert(tipo);
        alert.setTitle(titulo);
        alert.setHeaderText(encabezado);
        alert.setContentText(contenido);
        alert.showAndWait();
    }

    private void limpiarCampos() {
        textNombre.clear();
        textApellido.clear();
        textEdad.clear();
        textId.clear();
    }

    @FXML
    void initialize() {
    }
}
