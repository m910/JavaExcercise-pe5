package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class ModifyMapElement {

    public Map<String, String> modifyMapElement(Map<String,String> input){

        // val1=input.get(val1);
         //val2=input.get(val1);

        String val1=input.get("val1");

        input.replace("val2",val1);

        input.replace("val1", " ");

        return input;


    }
}
