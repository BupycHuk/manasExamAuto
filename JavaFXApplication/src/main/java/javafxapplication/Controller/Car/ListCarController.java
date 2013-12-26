package javafxapplication.Controller.Car;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafxapplication.Model.Car;
import javafxapplication.Model.RequestDto.AddCarRequest;
import javafxapplication.Proxy.CarProxy;

import javax.naming.spi.InitialContextFactory;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class ListCarController implements Initializable {
    public Button koshuu;
    public TextField carName;
    public TableView tableView1;
    public TableColumn carNameColumn;
    public TableColumn Id;
    public Label labelerror;

    CarProxy carProxy = new CarProxy();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        List<Car> cars= Arrays.asList(carProxy.getCars());
        tableView1.getItems().setAll(cars);
        Id.setCellValueFactory(new PropertyValueFactory<Car, Long>("id"));
        carNameColumn.setCellValueFactory(new PropertyValueFactory<Car, String>("carName"));
    }

    public void savetodatabase(){
        List<Car> cars= Arrays.asList(carProxy.getCars());
        tableView1.getItems().setAll(cars);
        Id.setCellValueFactory(new PropertyValueFactory<Car, Long>("id"));
        carNameColumn.setCellValueFactory(new PropertyValueFactory<Car, String>("carName"));
    }
    public void saktoo(ActionEvent actionEvent) {
        if (!carName.getText().isEmpty()){
            String carNames;
            carNames=carName.getText();
            AddCarRequest request = new AddCarRequest(carNames);
            carProxy.addCar(request);
            savetodatabase();
        }else {
            labelerror.setText("Error");
        }
    }
}
