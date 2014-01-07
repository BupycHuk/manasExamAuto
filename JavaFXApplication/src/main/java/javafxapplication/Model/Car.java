package javafxapplication.Model;

/**
 * Created with IntelliJ IDEA.
 * User: SAMAGAN
 * Date: 1/7/14
 * Time: 3:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class Car {

    private int id;
    private String carName;

    public String getName() {
        return carName;
    }

    public void setName(String name) {
        this.carName = carName;
    }

    public int getId() {
        return id;
    }

    public String toString()
    {
        return getName();

    }

    public void setId(int id) {
        this.id = id;
    }
}
