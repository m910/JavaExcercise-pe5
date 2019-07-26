package com.stackroute.pe5;

import java.util.*;

public class NumberOfCountsOfString {

    Map<String, Integer> data = new HashMap<>();

    @Override
    public String toString() {
        return "CountString{" +
                "data=" + data +
                '}';
    }

    public String numberOfCountsOfString(String input){

        List<String> arrayofStrings = Arrays.asList(input.split("[\\W_]+"));

        for (String fields : arrayofStrings) {

            if (data.containsKey(fields)) {

                data.replace(fields, 1 + data.get(fields));
            }
            else {

                data.put(fields, 1);
            }
        }
        return toString();
    }

    }




