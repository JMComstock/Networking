import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class ConvertURI {

    public static void main(String[] args) {

        try {

            // Absolute URI
            URI baseUri = new URI("http://username:password@myserver.com:5000");
            // Relative URI
            URI uri1 = new URI("/catalogue/phones?os=iOS15.4#Apple");
            URI uri2 = new URI("/catalogue/tvs?manufacturer=samsung");
            URI uri3 = new URI("/stores/locations?zip=78207");

            // combining the base URI with relative uri
            URI resolvedUri1 = baseUri.resolve(uri1);
            URI resolvedUri2 = baseUri.resolve(uri2);
            URI resolvedUri3 = baseUri.resolve(uri3);

            // convert a URI to a URL
            URL url1 = resolvedUri1.toURL();
            System.out.println("URL = " + url1);
            URL url2 = resolvedUri2.toURL();
            System.out.println("URL = " + url2);
            URL url3 = resolvedUri3.toURL();
            System.out.println("URL = " + url3);

            URI relativizedURI = baseUri.relativize(resolvedUri2);
            System.out.println("Relative URI = " + relativizedURI);

        } catch (URISyntaxException e) {
            System.out.println("URI Bad Syntax: " + e.getMessage());
        } catch (MalformedURLException e) {
            System.out.println("URL Malformed: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal Argument: " + e.getMessage());
        }

    }
}
