package edu.ijse.layered.fx.orm.controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class SupplierController {

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtTelNum;

    @FXML
    private TextField txtSearch;

    @FXML
    private TableView<SupplierDTO> tblSupplier;

    @FXML
    private TableColumn<SupplierDTO, Integer> colId;

    @FXML
    private TableColumn<SupplierDTO, String> colName;

    @FXML
    private TableColumn<SupplierDTO, Integer> colTelNum;


    @FXML
    public void initialize() {
    }

    @FXML
    private void btnSaveOnAction() {
    }

    @FXML
    private void btnUpdateOnAction() {
    }

    @FXML
    private void btnDeleteOnAction() {
    }

    @FXML
    private void btnClearOnAction() {
    }

    private void clearFields() {
    }

    @FXML
    private void txtSearchOnKeyReleased() {
    }

    @FXML
    private void tblSupplierOnMouseClicked() {

    }
}