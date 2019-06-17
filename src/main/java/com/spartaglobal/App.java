package com.spartaglobal;

import java.util.Map;

public class App 
{

    public static void main( String[] args )
    {
        Deserialiser deserialiser = new Deserialiser("resources/postcode.json");
        Map mappedResult = deserialiser.mapped.getResult();
        Map codes = (Map)mappedResult.get("codes");

        System.out.println(deserialiser.mapped.getStatus());
        System.out.println( deserialiser.mapped.getResult().get("postcode") );
        System.out.println(codes.get("parish"));

    }
}
