module com.milton.concesionaria {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.bootstrapfx.core;
    requires com.gluonhq.charm.glisten;
    requires com.gluonhq.attach.display;


    opens com.milton.concesionaria to javafx.fxml;
    exports com.milton.concesionaria;
    exports com.milton.concesionaria.controllers;
    opens com.milton.concesionaria.controllers to javafx.fxml;
}