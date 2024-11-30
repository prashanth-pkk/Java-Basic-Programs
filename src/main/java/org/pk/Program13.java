package org.pk;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class Program13 {
    public static void main(String[] args) throws IOException {
        URL object = new URL("https://www.facebook.com");
        URLConnection urlConnection = object.openConnection();
        int length = urlConnection.getContentLength();
        System.out.println(length);
    }
}
