package javafxapplication.Model;

/**
 * Created by Admin on 12/26/13.
 */
public class Car {
    private long id;
    private String carName;

    protected Car(){}

    public Car(String carName){
        this.carName = carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    public long getId() {
        return id;
    }
}
