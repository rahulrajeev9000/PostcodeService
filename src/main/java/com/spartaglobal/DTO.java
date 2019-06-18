package com.spartaglobal;

import java.util.Map;

public class DTO {

    private int status;
    private Map<String, Object> result;


    public int getStatus() {
        return status;
    }

    public Map<String, Object> getResult() {
        return result;
    }

    public String getPostcode(){
        return (String)getResult().get("postcode");
    }

    public int getQuality(){
        return (int)getResult().get("quality");
    }

    public int getEastings(){
        return (int)getResult().get("eastings");
    }

    public int getNorthings(){
        return (int)getResult().get("northings");
    }

    public String getCountry(){
        return (String)getResult().get("country");
    }

    public String getNhsHa(){
        return (String)getResult().get("nhs_ha");
    }

    public double getLongitude(){
        return (double)getResult().get("longitude");
    }

    public double getLatitude(){
        return (double)getResult().get("latitude");
    }

    public String geteuropean_electoral_region(){
        return (String)getResult().get("european_electoral_region");
    }

    public String getprimary_care_trust(){
        return (String)getResult().get("primary_care_trust");
    }

    public String getRegion(){
        return (String)getResult().get("region");
    }

    public String getLsoa(){
        return (String)getResult().get("lsoa");
    }

    public String getMsoa(){
        return (String)getResult().get("msoa");
    }

    public String getIncode(){
        return (String)getResult().get("incode");
    }

    public String getOutcode(){
        return (String)getResult().get("outcode");
    }


    public String getAdminDistrict(){
        return (String)getResult().get("admin_district");
    }

    public String getAdminCounty(){
        return (String)getResult().get("admin_county");
    }

    public String getAdminWard(){
        return (String)getResult().get("admin_ward");
    }

    public String getParish(){
        return (String)getResult().get("parish");
    }

    public String getParliamentaryConstituency(){
        return (String)getResult().get("parliamentary_constituency");
    }

    public String getCcg(){
        return (String)getResult().get("ccg");
    }

    public String getCed(){
        return (String)getResult().get("ced");
    }

    public String getNuts(){
        return (String)getResult().get("nuts");
    }



    public Map getCodes(){
        Map listResult = result;
        return (Map)listResult.get("codes");
    }

    public String getAdminDistrictCode(){
        return (String)getCodes().get("admin_district");
    }

    public String getAdminCountyCode(){
        return (String)getCodes().get("admin_county");
    }

    public String getAdminWardCode(){
        return (String)getCodes().get("admin_ward");
    }

    public String getParishCode(){
        return (String)getCodes().get("parish");
    }

    public String getParliamentaryConstituencyCode(){
        return (String)getCodes().get("parliamentary_constituency");
    }

    public String getCcgCode(){
        return (String)getCodes().get("ccg");
    }

    public String getCedCode(){
        return (String)getCodes().get("ced");
    }

    public String getNutsCode(){
        return (String)getCodes().get("nuts");
    }

}
