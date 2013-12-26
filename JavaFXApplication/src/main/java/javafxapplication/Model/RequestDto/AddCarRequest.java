package javafxapplication.Model.RequestDto;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 26.12.13
 * Time: 17:59
 * To change this template use File | Settings | File Templates.
 */
import java.io.Serializable;
public class AddCarRequest implements Serializable{

    private String name;

    public AddCarRequest(){}

    public AddCarRequest(String name){
        this.name = name;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
