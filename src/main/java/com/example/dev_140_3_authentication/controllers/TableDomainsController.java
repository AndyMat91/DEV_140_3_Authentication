package com.example.dev_140_3_authentication.controllers;

import com.example.dev_140_3_authentication.models.Domain;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.Date;

public class TableDomainsController {
    @FXML
    private TableView<Domain> table;
    @FXML
    private TableColumn<Domain, Integer> idCol;
    @FXML
    private TableColumn<Domain, String> webCol;
    @FXML
    private TableColumn<Domain, String> domCol;
    @FXML
    private TableColumn<Domain, String> ipCol;
    @FXML
    private TableColumn<Domain, Date> dateCol;
    @FXML
    private TableColumn<Domain, String> countryCol;
    @FXML
    private TableColumn<Domain, Integer> personIdCol;


    public void initTable(ObservableList<Domain> domains) {
        if (table.getItems().size() < 1) {
            idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
            webCol.setCellValueFactory(new PropertyValueFactory<>("webname"));
            domCol.setCellValueFactory(new PropertyValueFactory<>("domainname"));
            ipCol.setCellValueFactory(new PropertyValueFactory<>("ip"));
            dateCol.setCellValueFactory(new PropertyValueFactory<>("datereg"));
            countryCol.setCellValueFactory(new PropertyValueFactory<>("countryreg"));
            personIdCol.setCellValueFactory(new PropertyValueFactory<>("personid"));
            table.setItems(domains);
        }
    }
}
