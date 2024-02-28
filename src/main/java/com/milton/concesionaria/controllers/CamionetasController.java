package com.milton.concesionaria.controllers;
import java.net.URL;
import java.util.ResourceBundle;

import com.milton.concesionaria.HelloApplication;
import com.milton.concesionaria.models.Camioneta;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class CamionetasController {
        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private TextField text1;

        @FXML
        private TextField text2;

        @FXML
        private TextField text3;

        @FXML
        private TextField text4;

        @FXML
        private TextField text5;

        @FXML
        private TextField text6;

        @FXML
        private RadioButton bttonsi;

        @FXML
        private TextField text7;

        @FXML
        private Button bttonAdd;

        @FXML
        private Button Bttoncancelar;

        @FXML
        void Bttoncancelar(ActionEvent event) {

        }

        @FXML
        void Onbttonsi(MouseEvent event) {

        }
    public void bttonsi(ActionEvent actionEvent) {
    }

    public void onBttoncancelar(MouseEvent mouseEvent) {
            HelloApplication.getStageView().close();
    }
    @FXML
    void bttonAdd(MouseEvent event) {
        try {
            String modelo = text1.getText();
            String color = text2.getText();
            int cilindros = Integer.parseInt(text3.getText());
            int precio = Integer.parseInt(text4.getText());
            int anio = Integer.parseInt(text5.getText());
            String serieMotor = text6.getText();
            String todoTerreno = bttonsi.isSelected() ? "Si" : "No";
            int capacidadCarga = Integer.parseInt(text7.getText());

            if (modelo.isEmpty() || color.isEmpty() || serieMotor.isEmpty()) {
                throw new IllegalArgumentException("Faltan datos por introducir en el formulario.");
            }

            Camioneta camioneta = new Camioneta(modelo, color, cilindros, precio, anio, serieMotor, todoTerreno, capacidadCarga);
            HelloApplication.getAdmin().addCarros(camioneta);


            mostrarAlerta("Camioneta Creada", "Datos de la Camioneta:",
                    "Modelo: " + modelo + "\nColor: " + color + "\nCilindros: " + cilindros
                            + "\nPrecio: " + precio + "\nAño: " + anio + "\nSerie Motor: " + serieMotor
                            + "\nTodo Terreno: " + todoTerreno + "\nCapacidad Carga: " + capacidadCarga,
                    Alert.AlertType.INFORMATION);
        } catch (NumberFormatException e) {
            mostrarAlerta("Error", "Error al ingresar datos numéricos", "Ingrese datos numéricos válidos.", Alert.AlertType.ERROR);
        } catch (IllegalArgumentException e) {
            mostrarAlerta("Error", "Faltan datos en el formulario", e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    private void mostrarAlerta(String titulo, String encabezado, String contenido, Alert.AlertType tipo) {
        Alert alert = new Alert(tipo);
        alert.setTitle(titulo);
        alert.setHeaderText(encabezado);
        alert.setContentText(contenido);
        alert.showAndWait();
    }
        @FXML
        void initialize() {

        }


}


