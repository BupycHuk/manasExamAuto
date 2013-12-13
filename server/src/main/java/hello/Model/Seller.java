package hello.Model;

import javax.persistence.*;

@Entity
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="fullName")
    private String fullName;
    @Column(name="login")
    private String login;
    @Column(name="password")
    private String password;

    protected Seller() {}

    public Seller(String firstName, String lastName, String password) {
        this.fullName = firstName;
        this.login = lastName;
        this.password = password;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public long getId() {
        return id;
    }
    public void setId(long Id)
    {
        this.id = Id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "shop")
    private Shop shop;

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}

