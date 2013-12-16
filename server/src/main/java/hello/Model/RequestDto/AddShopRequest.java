package hello.Model.RequestDto;

import java.io.Serializable;
/**
 * Created with IntelliJ IDEA.
 * User: Администратор
 * Date: 09.12.13
 * Time: 15:13
 * To change this template use File | Settings | File Templates.
 */
public class AddShopRequest implements Serializable{

    private long id;
    private String name;
    private String contacts;
    protected AddShopRequest() {}

    public AddShopRequest(String name, String contacts) {
        this.name = name;
        this.contacts = contacts;
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
}
