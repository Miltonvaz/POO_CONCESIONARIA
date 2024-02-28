package com.milton.concesionaria.controllers;

import com.milton.concesionaria.HelloApplication;
import com.milton.concesionaria.models.Sedan;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class SedanController {

    @FXML
    private AnchorPane bttonguardar;

    @FXML
    private TextField texfiled1;

    @FXML
    private TextField textfield2;

    @FXML
    private TextField texfield3;

    @FXML
    private TextField texfield4;

    @FXML
    private TextField textfield5;

    @FXML
    private TextField texfield6;

    @FXML
    private TextField textfield7;

    @FXML
    private Button bttonAdd;

    @FXML
    private Button bttoncanceled;
    @FXML
    public void bttonguardar(MouseEvent mouseEvent) {
    }
    @FXML
    public void onbttonguardar(MouseEvent mouseEvent) {
    }
    @FXML
    public void bttoncanceled(ActionEvent actionEvent) {
    }
    @FXML
    public void onbttoncanceled(MouseEvent mouseEvent) {
    }

    @FXML
    void bttonAdd(MouseEvent event) {
        try {
            String modelo = texfiled1.getText();
            String color = textfield2.getText();
            int cilindros = Integer.parseInt(texfield3.getText());
            int precio = Integer.parseInt(texfield4.getText());
            int año = Integer.parseInt(textfield5.getText());
            String serieMotor = texfield6.getText();
            int velocidadMax = Integer.parseInt(textfield7.getText());

            if (modelo.isEmpty() || color.isEmpty() || serieMotor.isEmpty()) {
                throw new IllegalArgumentException("Faltan datos por introducir en el formulario.");
            }

            Sedan sedan = new Sedan(modelo, color, cilindros, precio, año, serieMotor, velocidadMax);
            HelloApplication.getAdmin().addCarros(sedan);

            mostrarAlerta("Sedan Creado", "Datos del Sedan:",
                    "Modelo: " + modelo + "\nColor: " + color + "\nCilindros: " + cilindros
                            + "\nPrecio: " + precio + "\nAño: " + año + "\nSerie Motor: " + serieMotor
                            + "\nVelocidad Máxima: " + velocidadMax,
                    Alert.AlertType.INFORMATION);
        } catch (NumberFormatException e) {
            mostrarAlerta("Error", "Error al ingresar datos numéricos", "Ingrese datos numéricos válidos.", Alert.AlertType.ERROR);
        } catch (IllegalArgumentException e) {
            mostrarAlerta("Error", "Faltan datos en el formulario", e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    @FXML
    void onbttoncanceled(ActionEvent event) {
        HelloApplication.getStageView().close();
    }

    private void mostrarAlerta(String titulo, String encabezado, String contenido, Alert.AlertType tipo) {
        Alert alert = new Alert(tipo);
        alert.setTitle(titulo);
        alert.setHeaderText(encabezado);
        alert.setContentText(contenido);
        alert.showAndWait();
    }


}

