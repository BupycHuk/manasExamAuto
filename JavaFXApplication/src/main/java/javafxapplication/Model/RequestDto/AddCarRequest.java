package javafxapplication.Model.RequestDto;

import java.io.Serializable;

public class AddCarRequest implements Serializable {
    private String carName;

    protected AddCarRequest(){}

    public AddCarRequest(String carName){
        this.carName = carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

}