package hello.Model.RequestDto;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 25.11.13
 * Time: 13:36
 * To change this template use File | Settings | File Templates.
 */
public class AddShopRequest implements Serializable {
    private long shopId;
    private String shopname;
    private String contacts;


    public AddShopRequest()
    {

    }

    public AddShopRequest(long shopId, String sellername, String contacts) {
        //To change body of created methods use File | Settings | File Templates.
        this.shopId = shopId;
        this.shopname = sellername;
        this.contacts = contacts;

    }

    public long getShopId() {
        return shopId;
    }

    public void setShopId(long shopId)
    {
        this.shopId =shopId;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname)
    {
        this.shopname = shopname;
    }


    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts)
    {
        this.contacts = contacts;
    }




}
