package hello.Model;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 26.12.13
 * Time: 16:34
 * To change this template use File | Settings | File Templates.
 */
import javax.persistence.*;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class AutoPart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="price")
    private double price;

    public AutoPart(String name, double price){
        this.name = name;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @OneToMany (mappedBy = "Cars")
    @JsonIgnore
    private Set<Cars> cars;
    public Set<Cars> getCars(){
        return cars;
    }


    @OneToMany (mappedBy = "autoPart")
    @JsonIgnore
    private Set<AutoPartType> autoPartType;
    public  Set<AutoPartType> getAutoPartType(){
        return autoPartType;
    }

}
