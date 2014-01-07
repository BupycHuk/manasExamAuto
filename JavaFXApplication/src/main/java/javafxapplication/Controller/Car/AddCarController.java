package javafxapplication.Controller.Car;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafxapplication.Model.Car;
import javafxapplication.Proxy.CarProxy;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created with IntelliJ IDEA.
 * User: SAMAGAN
 * Date: 1/7/14
 * Time: 2:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class AddCarController implements Initializable {

    public ComboBox carComboBox;
    @FXML
    private TextField text2;
    @FXML
    private TextField text3;
    @FXML


    CarProxy carProxy = new CarProxy();

    @FXML

    private void handleButtonAction(ActionEvent actionEvent){
        String carName;
        Car car = (Car)carComboBox.getValue();
        int CarId = (car!=null)? (int)car.getId() : 0;
        carName = text2.getText();

        AddCarRequest  request = new AddCarRequest(carId, carName);
        carProxy.addCar(request);
        text2.setText("");
        text3.setText("");
    }

    @FXML

    private void textClear(javafx.event.ActionEvent event){
        text2.setText("");
        text3.setText("");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Car[] cars = carProxy.getCars();
        carComboBox.getItems().setAll(cars);
    }
}
