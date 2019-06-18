package com.spartaglobal;

import org.hamcrest.core.IsInstanceOf;
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
    public void testStatusType(){
        Assert.assertTrue(Integer.class.isInstance(deserialiser.mapped.getStatus()));
    }

    @Test
    public void testPostcodeType(){
        Assert.assertTrue(deserialiser.mapped.getPostcode() instanceof String);
    }

    @Test
    public void testQualityType(){
        Assert.assertTrue(Integer.class.isInstance(deserialiser.mapped.getQuality()));
    }

    @Test
    public void testEastingsType(){
        Assert.assertTrue(Integer.class.isInstance(deserialiser.mapped.getEastings()) || (Integer)deserialiser.mapped.getEastings()==null);
    }

    @Test
    public void testNorthingsType(){
        Assert.assertTrue(Integer.class.isInstance(deserialiser.mapped.getNorthings()) || (Integer)deserialiser.mapped.getNorthings()==null);
    }

    @Test
    public void testCountryType(){
        Assert.assertTrue(deserialiser.mapped.getCountry() instanceof String) ;
    }

    @Test
    public void testNhsHaType(){
        Assert.assertTrue(deserialiser.mapped.getNhsHa() instanceof String|| deserialiser.mapped.getNhsHa()==null);
    }

    @Test
    public void testLongitudeType(){
        Assert.assertTrue(Double.class.isInstance(deserialiser.mapped.getLongitude()));
    }

    @Test
    public void testLatitudeType(){
        Assert.assertTrue(Double.class.isInstance(deserialiser.mapped.getLatitude()));
    }

    @Test
    public void testEuropeanElectoralRegionaType(){
        Assert.assertTrue(deserialiser.mapped.geteuropean_electoral_region() instanceof String || deserialiser.mapped.geteuropean_electoral_region()==null);
    }

    @Test
    public void testPrimaryCareTrustType(){
        Assert.assertTrue(deserialiser.mapped.getprimary_care_trust() instanceof String || deserialiser.mapped.getParliamentaryConstituency()==null);
    }

    @Test
    public void testRegionType(){
        Assert.assertTrue(deserialiser.mapped.getRegion() instanceof String || deserialiser.mapped.getRegion()==null);
    }

    @Test
    public void testLsoaType(){
        Assert.assertTrue(deserialiser.mapped.getLsoa() instanceof String|| deserialiser.mapped.getLsoa()==null);
    }

    @Test
    public void testMsoaType(){
        Assert.assertTrue(deserialiser.mapped.getMsoa() instanceof String || deserialiser.mapped.getLsoa()==null);
    }

    @Test
    public void testIncodeType(){
        Assert.assertTrue(deserialiser.mapped.getIncode() instanceof String);
    }

    @Test
    public void testOutcodeType(){
        Assert.assertTrue(deserialiser.mapped.getOutcode() instanceof String);
    }

    @Test
    public void testParliamentaryConstituencyType(){
        Assert.assertTrue(deserialiser.mapped.getParliamentaryConstituency() instanceof String|| deserialiser.mapped.getParliamentaryConstituency()==null);
    }

    @Test
    public void testAdminDistrictType(){
        Assert.assertTrue(deserialiser.mapped.getAdminDistrict() instanceof String || deserialiser.mapped.getAdminDistrict()==null);
    }

    @Test
    public void testParishType(){
        Assert.assertTrue(deserialiser.mapped.getParish() instanceof String|| deserialiser.mapped.getParish()==null);
    }

    @Test
    public void testAdminCountyType(){
        Assert.assertTrue(deserialiser.mapped.getAdminCounty() instanceof String || deserialiser.mapped.getAdminCounty()==null);
    }

    @Test
    public void testAdminWardType(){
        Assert.assertTrue(deserialiser.mapped.getAdminWard() instanceof String || deserialiser.mapped.getAdminWard()==null);
    }

    @Test
    public void testCedType(){
        Assert.assertTrue(deserialiser.mapped.getCed() instanceof String|| deserialiser.mapped.getCed()==null);
    }

    @Test
    public void testCcgType(){
        Assert.assertTrue(deserialiser.mapped.getCcg() instanceof String|| deserialiser.mapped.getCcg()==null);
    }

    @Test
    public void testNutsType(){
        Assert.assertTrue(deserialiser.mapped.getNuts() instanceof String || deserialiser.mapped.getNuts()==null);
    }

    @Test
    public void testCodeAdminDistrictType(){
        Assert.assertTrue(deserialiser.mapped.getAdminDistrictCode() instanceof String|| deserialiser.mapped.getAdminDistrictCode()==null);
    }

    @Test
    public void testCodeAdminCountyType(){
        Assert.assertTrue(deserialiser.mapped.getAdminCountyCode() instanceof String || deserialiser.mapped.getAdminCountyCode()==null);
    }

    @Test
    public void testCodeAdminWardType(){
        Assert.assertTrue(deserialiser.mapped.getAdminWardCode() instanceof String|| deserialiser.mapped.getAdminWardCode()==null);
    }

    @Test
    public void testCodeParishType(){
        Assert.assertTrue(deserialiser.mapped.getParishCode() instanceof String|| deserialiser.mapped.getParishCode()==null);
    }

    @Test
    public void testCodeParliamentaryConstituencyType(){
        Assert.assertTrue(deserialiser.mapped.getParliamentaryConstituencyCode() instanceof String|| deserialiser.mapped.getParliamentaryConstituencyCode()==null);
    }

    @Test
    public void testCodeCcgType(){
        Assert.assertTrue(deserialiser.mapped.getCcgCode() instanceof String|| deserialiser.mapped.getCcgCode()==null);
    }

    @Test
    public void testCodeCedType(){
        Assert.assertTrue(deserialiser.mapped.getCedCode() instanceof String || deserialiser.mapped.getCedCode()==null);
    }

    @Test
    public void testCodeNutsType(){
        Assert.assertTrue(deserialiser.mapped.getNutsCode() instanceof String || deserialiser.mapped.getNutsCode()==null);
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
    public void testGetPostcode(){
        Assert.assertEquals("SE12 0NB", deserialiser.mapped.getPostcode());
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
    public void numberOfResults(){
        Assert.assertEquals(24, deserialiser.mapped.getResult().size());
    }

    @Test
    public void testNutsCode(){
        Assert.assertEquals("UKI44", deserialiser.mapped.getNutsCode());
    }
}
