package com.spartaglobal;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

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
        Assert.assertEquals("E43000213", deserialiser.mapped.getParishCode());
    }

    @Test
    public void numberOfCodes(){
        Assert.assertEquals(8, deserialiser.mapped.getCodes().size());
    }

    @Test
    public void testNutsCode(){
        Assert.assertEquals("UKI44", deserialiser.mapped.getNutsCode());
    }
}
