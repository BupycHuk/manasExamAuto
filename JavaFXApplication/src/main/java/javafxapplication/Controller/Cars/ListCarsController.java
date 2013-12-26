package javafxapplication.Controller.Cars;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 26.12.13
 * Time: 18:04
 * To change this template use File | Settings | File Templates.
 */
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import javafxapplication.Model.Cars;
import javafxapplication.Proxy.CarProxy;
import javafxapplication.Model.RequestDto.AddCarRequest;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class ListCarsController {
    public ComboBox carComboBox;
    @FXML

    public TableColumn carName;
    public TableColumn price;
    public TableColumn autoPartType;

    CarProxy carProxy = new CarProxy();

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        carName.setCellValueFactory(new PropertyValueFactory<Cars, String>("name"));
        price.setCellValueFactory(new PropertyValueFactory<Cars, String>("price"));
        autoPartType.setCellValueFactory(new PropertyValueFactory<Cars, String>("autoPartType"));
    }

    public void textTolukta(ActionEvent actionEvent) {
        List<Cars> cars = Arrays.asList(carProxy.getCars());

        tableView1.getItems().setAll(cars);
    }
 }

