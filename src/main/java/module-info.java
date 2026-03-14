module edu.ijse.layered.fx.orm {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;
    requires jakarta.persistence;

    opens edu.ijse.layered.fx.orm to javafx.fxml;

    exports edu.ijse.layered.fx.orm;
}