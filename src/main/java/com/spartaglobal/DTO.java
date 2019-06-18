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
