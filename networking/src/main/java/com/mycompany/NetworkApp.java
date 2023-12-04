package com.mycompany;

import java.net.InetAddress;
import java.net.URI;
import java.net.URL;



public class NetworkApp {
    private NetworkApp() {

    }

    public static NetworkApp getInstance() {
        return new NetworkApp();
    }


    int getPort(final String query) {
        int port = 0;
        try {

            // String query = "https://www.awwwards.com";

            if (!query.contains("http://") || !query.contains("https://")) {
                String newQuery = insertString(query, "https://", -1);

                URL url = new URI(newQuery).toURL();
                port = url.getPort();
            } else {
                URL url = new URI(query).toURL();
                port = url.getPort();
            }

            // URI url = new URI(query);

        } catch (Exception e) {
            System.out.println(e);
        }

        return port;
    }

    String getProtocol(final String query) {
        String protocol = "";
        try {

            // String query = "https://www.awwwards.com";

            if (!query.contains("http://") || !query.contains("https://")) {
                String newQuery = insertString(query, "https://", -1);

                URL url = new URI(newQuery).toURL();
                protocol = url.getProtocol();
            } else {
                URL url = new URI(query).toURL();
                protocol = url.getProtocol();
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return protocol;
    }

    String getDomainName(final String query) {
        String hostName = "";
        try {

            // String query = "www.awwwards.com";

            if (query.contains("https://") || query.contains("http://")) {
                String[] newStr = query.split("https://", 0);
                String newQuery = "";

                for (String a : newStr) {
                    newQuery += a;
                }

                InetAddress ipAddress = InetAddress.getByName(newQuery);
                hostName = ipAddress.getHostName();

            } else {
                InetAddress ipAddress = InetAddress.getByName(query);
                hostName = ipAddress.getHostName();
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return hostName;
    }

    String getIpAddress(final String query) {
        String hostAddress = "";
        try {

            // String query = "www.awwwards.com";

            if (query.contains("https://") || query.contains("http://")) {
                String[] newStr = query.split("https://", 0);
                String newQuery = "";

                for (String a : newStr) {
                    newQuery += a;
                }

                InetAddress ipAddress = InetAddress.getByName(newQuery);
                hostAddress = ipAddress.getHostAddress();
            } else {
                InetAddress ipAddress = InetAddress.getByName(query);
                hostAddress = ipAddress.getHostAddress();
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return hostAddress;
    }

    String getHost(final String query) {
        String host = "";
        try {

            // String query = "https://www.awwwards.com";

            if (!query.contains("http://") || !query.contains("https://")) {
                String newQuery = insertString(query, "https://", -1);

                URL url = new URI(newQuery).toURL();
                host = url.getHost();
            } else {
                URL url = new URI(query).toURL();
                host = url.getHost();
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return host;
    }

    String insertString(String originalString, String stringToBeInserted, int index) {

        // Create a new string
        String newString = originalString.substring(0, index + 1)
                + stringToBeInserted
                + originalString.substring(index + 1);

        // return the modified String
        return newString;
    }

}
