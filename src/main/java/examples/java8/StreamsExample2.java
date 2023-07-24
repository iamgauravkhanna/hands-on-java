package examples.java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamsExample2 {

    public static void main(String[] args) {
        String host = "10.10.3.4,10.10.3.5,10.10.3.10";
        String port = "8080";

        String[] arrayOfHost = host.split(",");

        String servers = Arrays.stream(host.split(","))
                .map(ip -> ip + ":" + port)
                .collect(Collectors.joining(","));

        System.out.println("Server List :: " + servers);
    }
}