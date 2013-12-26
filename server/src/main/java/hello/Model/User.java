package hello.Model;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public long getId() {
        return id;
    }
    public void setId(long Id)
    {
        this.id = Id;
    }
}
public class Cars
{
    int ID;
    String carName;
    public Cars (String cname)
    {
        name=cname;
    }
    public static void main(String[] args)
    {
        Cars myCars=new Cars ("Volvo")

    }
}
public class SpareOfCar
{
}
public class HelloClient {
    public static void main(String[] args) {
        try {
            Hello proxy = (Hello)(new HelloFriend().getHelloIF());
            proxy._setTargetEndpoint(args[0]);
            System.out.println(proxy.sayHello("Hello"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}