
package javafxapplication.Model;
public class Shop
{
    private long id;
    private String name;

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
}
