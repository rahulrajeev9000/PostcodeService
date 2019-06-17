package com.spartaglobal;

import com.fasterxml.jackson.databind.util.JSONPObject;

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

}
