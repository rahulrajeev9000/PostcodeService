package com.spartaglobal;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Map;

public class PostcodeTests {

    private static Deserialiser deserialiser;

    @BeforeClass
    public static void setup(){
        deserialiser = new Deserialiser("resources/postcode.json");
    }

    @Test
    public void testStatus(){
        Assert.assertEquals(200, deserialiser.mapped.getStatus());
    }

    @Test
    public void testPostcode(){
        Assert.assertEquals("SE12 0NB", deserialiser.mapped.getResult().get("postcode"));
    }

    @Test
    public void testCodeParish(){
        Map mappedResult = deserialiser.mapped.getResult();
        Map codes = (Map)mappedResult.get("codes");
        Assert.assertEquals("E43000213", codes.get("parish"));
    }

    @Test
    public void numberOfCodes(){
        Map mappedResult = deserialiser.mapped.getResult();
        Map codes = (Map)mappedResult.get("codes");
        Assert.assertEquals(8, codes.size());
    }
}
