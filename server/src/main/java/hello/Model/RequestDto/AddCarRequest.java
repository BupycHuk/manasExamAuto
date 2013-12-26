package hello.Model.RequestDto;

/**
 * Created by Admin on 12/26/13.
 */
public class AddCarRequest {
    private String carName;

    public AddCarRequest()
    {

    }
    public  AddCarRequest (String carName){
        this.carName = carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }
}
