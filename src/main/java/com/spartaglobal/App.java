package com.spartaglobal;

public class App {

    public static void main( String[] args ) {

        Deserialiser deserialiser = new Deserialiser("resources/postcode.json");

        System.out.println(deserialiser.mapped.getStatus());
        System.out.println( deserialiser.mapped.getResult().get("postcode") );
        System.out.println(deserialiser.mapped.getParishCode());

    }
}
