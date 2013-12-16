
package javafxapplication.Model;
public class Shop
{
    private long id;
    private String name;
    private String contacts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String toString()
    {
        return getId()+" - "+getName();

    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }
}
