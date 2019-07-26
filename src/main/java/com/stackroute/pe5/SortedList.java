package com.stackroute.pe5;

import java.util.*;

public class SortedList {

    public List<String> sortingTheArrayList(Set<String> input){

       Set<String>  sorted=new TreeSet<String>(input);

        List<String> output=new ArrayList(sorted);

        return output;

    }
}
