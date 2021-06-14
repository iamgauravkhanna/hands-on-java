package javaExamples.json;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class GsonExample {

    public static void main(String args[]){
        gsonToJson();
        gsonFromJson();
    }

    private static void gsonFromJson() {

        String json_string = "{\"firstName\":\"John\", \"lastName\": \"Snow\"}";

        Gson gson = new Gson();

        User user = gson.fromJson(json_string, User.class);

        System.out.println(user);
    }

    private static void gsonToJson() {
        Map<Integer, String> colours = new HashMap<>();
        colours.put(1, "blue");
        colours.put(2, "yellow");
        colours.put(3, "green");

        Gson gson = new Gson();

        String output = gson.toJson(colours);

        System.out.println("Colors : " + output);
    }

    class User {

        private final String firstName;
        private final String lastName;

        public User(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        @Override
        public String toString() {
            return new StringBuilder().append("User { ").append("First name: ")
                    .append(firstName).append(", Last name: ")
                    .append(lastName).append(" }").toString();
        }
    }
}
