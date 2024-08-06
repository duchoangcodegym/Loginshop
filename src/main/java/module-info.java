module com.example.shop_laptop2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.shop_laptop2 to javafx.fxml;
    exports com.example.shop_laptop2;
}