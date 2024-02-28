package com.milton.concesionaria.controllers;

import com.milton.concesionaria.HelloApplication;
import com.milton.concesionaria.models.Deportivo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class DeportivoController {
    @FXML
    private TextField tex1;
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
    private TextField text7;
    @FXML
    private TextField text8;
    @FXML
    private Button bttonadd;
    @FXML
    private Button bttoncancelar;

    @FXML
    void bttonCancel(ActionEvent event) {
        HelloApplication.getStageView().close();
    }

    @FXML
    public void bttonAdd(MouseEvent mouseEvent){
        Alert alert;
        try {
            String modelo = tex1.getText();
            String color = text2.getText();
            int cilindros = Integer.parseInt(text3.getText());
            int precio = Integer.parseInt(text4.getText());
            int año = Integer.parseInt(text5.getText());
            String serieMotor = text6.getText();
            int velocidadMax = Integer.parseInt(text7.getText());
            int caballosFuerza = Integer.parseInt(text8.getText());

            if (modelo.isEmpty() || color.isEmpty() || serieMotor.isEmpty()) {
                throw new IllegalArgumentException("Faltan datos por introducir en el formulario.");
            }

            Deportivo dep = new Deportivo(modelo, color, cilindros, precio, año, serieMotor, velocidadMax, caballosFuerza);
            HelloApplication.getAdmin().addCarros(dep);

            System.out.println("Modelo : [" + modelo + "]");
            System.out.println("Color : [" + color + "]");
            System.out.println("Cilindros : [" + cilindros + "]");
            System.out.println("Precio : [" + precio + "]");
            System.out.println("Año : [" + año + "]");
            System.out.println("Serie : [" + serieMotor + "]");
            System.out.println("Velocidad Max : [" + velocidadMax + "]");
            System.out.println("Caballos de Fuerza : [" + caballosFuerza + "]");

            alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Datos introducidos en el formulario");
            alert.setHeaderText("Ha introducido correctamente los datos en el formulario. Se muestran a continuación.");
            alert.setContentText("Modelo: " + modelo + System.lineSeparator() +
                    "Año: " + año + System.lineSeparator() +
                    "Color: " + color + System.lineSeparator() +
                    "Serie: " + serieMotor + System.lineSeparator() +
                    "Precio: " + precio);
        } catch (NumberFormatException e) {
            alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error en la entrada de datos");
            alert.setHeaderText("Por favor, ingrese números válidos en los campos numéricos.");
        } catch (IllegalArgumentException e) {
            alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Faltan datos");
            alert.setHeaderText(e.getMessage());
        }
        alert.showAndWait();
    }

    @FXML
    void initialize() {
    }

    public void onbttonAdd(ActionEvent actionEvent) {
    }
}

