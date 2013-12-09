package javafxapplication.Model.RequestDto;

import java.io.Serializable;

public class AddShopRequest implements Serializable {

    private String name;
    private String contacts;


    public AddShopRequest()
    {

    }

    public AddShopRequest(String shopname, String shopcontacts) {
        //To change body of created methods use File | Settings | File Templates.
        this.name = shopname;
        this.contacts = shopcontacts;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }
}
