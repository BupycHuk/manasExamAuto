package hello.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Shop
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @Column(name="name")
    private String name;

    @Column(name="contacts")
    private String contacts;
    public Shop(){}

    public Shop(String shopName, String contacts)
    {
        this.name=shopName;
        this.contacts=contacts;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    @OneToMany (mappedBy = "shop", orphanRemoval = true, cascade={CascadeType.ALL}, targetEntity = Seller.class)
    @JsonIgnore(value = true)
    private List<Seller> sellerList;
}
