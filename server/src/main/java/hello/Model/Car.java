package hello.Model;

import javax.persistence.*;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="carName")
    private String carName;

    protected Car()
    {

    }
    public Car(String carName)
    {
        this.carName=carName;
    }

    public long getId() {
        return id;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }
}
