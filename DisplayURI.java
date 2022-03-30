import java.net.URI;
import java.net.URISyntaxException;

public class DisplayURI {

    public static void main(String[] args) throws URISyntaxException {

        URI uri = new URI("http://username:password@myserver.com:5000/catalogue/phones?os=iOS15.4#Apple");

        try {
            // DISPLAYING the parts of a URI
            System.out.println("Scheme = " + uri.getScheme());
            System.out.println("Scheme-specific part = " + uri.getSchemeSpecificPart());
            System.out.println("Authority = " + uri.getAuthority());
            System.out.println("User info = " + uri.getRawUserInfo());
            System.out.println("Host = " + uri.getHost());
            System.out.println("Port = " + uri.getPort());
            System.out.println("Path = " + uri.getPath());
            System.out.println("Query = " + uri.getQuery());
            System.out.println("Fragment = " + uri.getFragment());

        } catch (IllegalArgumentException e) {
            System.out.println("Illegal Argument: " + e.getMessage());
        }
    }
}
