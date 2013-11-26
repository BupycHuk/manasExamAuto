package hello.Model;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 25.11.13
 * Time: 13:36
 * To change this template use File | Settings | File Templates.
 */
public class PostExample implements Serializable {
    private String shopname;
    private String sellername;
    private String login;
    private String password;

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname)
    {
        this.shopname=shopname;
    }

    public String getSellername() {
        return sellername;
    }

    public void setSellername(String sellername)
    {
        this.sellername=sellername;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login)
    {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}
