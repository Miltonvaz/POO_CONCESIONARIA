package com.milton.concesionaria;

import com.milton.concesionaria.models.*;
import com.milton.concesionaria.models.Gestion;
import com.milton.concesionaria.controllers.MenuController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;
import java.io.IOException;


public class HelloApplication extends Application {

    private static Administracion admin = new Administracion();
    private static Gestion gestion = new Gestion();
    private static Stage stageView;
    private static Stage stageRoot;

    public static Gestion getGestion() {

        return gestion;
    }

    public static void setGestion(Gestion newGestion) {
        gestion = newGestion;
    }

    public static Administracion getAdmin() {
        return admin;
    }


    public static void setAdmin(Administracion newAdmin) {
        admin = newAdmin;
    }

    @Override
    public void start(Stage stage) throws IOException {
        stageRoot = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("menu-view.fxml"));
        Parent root = fxmlLoader.load();
        MenuController menuController = fxmlLoader.getController();
        menuController.init(stageRoot);

        Scene scene = new Scene(root);
        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        stage.setTitle("Concesionaria - Home");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    public static void newStage(String fxml, String title) {
        stageView = new Stage();
        Scene scene = null;
        try {
            scene = new Scene(loadFXML(fxml));
            scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
            stageView.setTitle(title);
            stageView.setScene(scene);
            stageView.centerOnScreen();
            stageView.initOwner(stageRoot);
            stageView.initModality(Modality.APPLICATION_MODAL);
            stageView.showAndWait();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static Stage getStageView() {
        return stageView;
    }

    public static void main(String[] args) {
        launch();
    }
}
