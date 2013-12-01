package javafxapplication.Tools;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 01.12.13
 * Time: 1:50
 * To change this template use File | Settings | File Templates.
 */
public class UrlService {
    private static String URL="http://localhost:8080";

    public String GetServerUrl(String s) {
        return URL + s;
    }
}
