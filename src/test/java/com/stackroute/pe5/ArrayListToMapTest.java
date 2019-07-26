package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ArrayListToMapTest {
    ArrayListToMap arrayListMap;

    @Before
    public void setUp() throws Exception {
        arrayListMap=new ArrayListToMap();
    }

    @After
    public void tearDown() throws Exception {

        arrayListMap=null;
    }

    @Test
    public void givenInputExpectedBooleanMapOutput(){
        String[] arr={"a","b","c","d","a","c","c"};

        assertEquals("ArrayListToMap{output={a=true, b=false, c=true, d=false}}",arrayListMap.arrayListToMap(arr));
    }

    @Test
    public void givenInputArrayStringExpectingMapOutput(){
        String[] arr={"a","b","c","d","a","d","d"};

        assertNotEquals("ArrayListToMap{output={a=true, b=false, c=true, d=false}}",arrayListMap.arrayListToMap(arr));

    }
}