/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javafxapplication.Model;

/**
 *
 * @author Akim
 */

public class Seller {
    private long id;
    private String fullName;
    private String login;
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

    private Shop shop;

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public String getShopname()
    {
        if (getShop()!=null)
            return getShop().getName();
        return null;
    }
}

