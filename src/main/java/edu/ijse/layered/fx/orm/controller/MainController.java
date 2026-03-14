package edu.ijse.layered.fx.orm.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class MainController {

    @FXML
    private AnchorPane contentPane;

    @FXML
    private Button customersBtn;

    @FXML
    private Label lblPageTitle;

    @FXML
    private Button logoutBtn;

    @FXML
    private VBox menuVBox;

    @FXML
    private Button ordersBtn;

    @FXML
    private Button productsBtn;

    @FXML
    private Button suppliersBtn;

    @FXML
    void navigateLogout(ActionEvent event) {

    }

}
