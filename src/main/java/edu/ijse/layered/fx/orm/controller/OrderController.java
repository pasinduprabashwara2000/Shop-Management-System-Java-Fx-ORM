package edu.ijse.layered.fx.orm.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class OrderController {

    @FXML
    private Button btnAddItem;

    @FXML
    private Button btnClear;

    @FXML
    private Button btnPlaceOrder;

    @FXML
    private Button btnRemoveItem;

    @FXML
    private ComboBox<?> cmbCustomerId;

    @FXML
    private ComboBox<?> cmbProductId;

    @FXML
    private TableColumn<?, ?> colItemId;

    @FXML
    private TableColumn<?, ?> colPrice;

    @FXML
    private TableColumn<?, ?> colProductId;

    @FXML
    private TableColumn<?, ?> colQty;

    @FXML
    private TableColumn<?, ?> colSubTotal;

    @FXML
    private DatePicker dpDate;

    @FXML
    private Label lblTotal;

    @FXML
    private TableView<?> tblOrderItems;

    @FXML
    private TextField txtCustomerName;

    @FXML
    private TextField txtOrderId;

    @FXML
    private TextField txtPrice;

    @FXML
    private TextField txtQty;

    @FXML
    void btnAddItemOnAction(ActionEvent event) {

    }

    @FXML
    void btnClearOnAction(ActionEvent event) {

    }

    @FXML
    void btnPlaceOrderOnAction(ActionEvent event) {

    }

    @FXML
    void btnRemoveItemOnAction(ActionEvent event) {

    }

    @FXML
    void cmbCustomerIdOnAction(ActionEvent event) {

    }

    @FXML
    void cmbProductIdOnAction(ActionEvent event) {

    }

}
