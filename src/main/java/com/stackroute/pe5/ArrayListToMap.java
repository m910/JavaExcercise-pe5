package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class ArrayListToMap {
    Map<String,Boolean> output;

    @Override
    public String toString() {
        return "ArrayListToMap{" +
                "output=" + output +
                '}';
    }

    public String arrayListToMap(String[] arr){

        output=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            String result=arr[i];

            if(output.containsKey(result))
                output.put(result,true);

            else
                output.put(result,false);
        }

        return toString();



    }

}




