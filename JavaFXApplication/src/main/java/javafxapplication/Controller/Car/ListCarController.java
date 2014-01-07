package javafxapplication.Controller.Car;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafxapplication.Model.Car;
import javafxapplication.Proxy.CarProxy;

import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created with IntelliJ IDEA.
 * User: SAMAGAN
 * Date: 1/7/14
 * Time: 2:17 PM
 * To change this template use File | Settings | File Templates.
 */

public class ListCarController implements Initializable {

    public TableColumn carName;
    public TableColumn carId;
    public TableView tableView1;

    CarProxy carProxy = new CarProxy();

    @Override
    public void Initialize(Url url, ResourceBundle rb) {
        carName.setCellValueFactory(new PropertyValueFactory<Car, String>("carName"));
        carId.setCellFactory(new PropertyValueFactory<Car, int>("carId"));
    }

    public void textTolukta(ActionEvent actionEvent) {
        List<Car> cars = Arrays.asList(carProxy.getCars());


        tableView1.getItems().setAll(cars);
    }
}
