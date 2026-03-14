package edu.ijse.layered.fx.orm.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class DashboardController {

    @FXML
    private TableColumn<?, ?> colLowStockName;

    @FXML
    private TableColumn<?, ?> colLowStockQty;

    @FXML
    private TableColumn<?, ?> colOrderCustomer;

    @FXML
    private TableColumn<?, ?> colOrderDate;

    @FXML
    private TableColumn<?, ?> colOrderId;

    @FXML
    private TableColumn<?, ?> colOrderStatus;

    @FXML
    private TableColumn<?, ?> colOrderTotal;

    @FXML
    private Label lblDate;

    @FXML
    private Label lblTime;

    @FXML
    private Label lblTodayOrders;

    @FXML
    private Label lblTotalCustomers;

    @FXML
    private Label lblTotalProducts;

    @FXML
    private Label lblTotalRevenue;

    @FXML
    private TableView<?> tblLowStock;

    @FXML
    private TableView<?> tblRecentOrders;

    @FXML
    void btnAddCustomerOnAction(ActionEvent event) {

    }

    @FXML
    void btnAddProductOnAction(ActionEvent event) {

    }

    @FXML
    void btnNewOrderOnAction(ActionEvent event) {

    }

    @FXML
    void btnViewAllOrdersOnAction(ActionEvent event) {

    }

    @FXML
    void btnViewReportsOnAction(ActionEvent event) {

    }

}
