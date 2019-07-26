package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ModifyMapElementTest {
    ModifyMapElement modifyMapElement;


    @Before
    public void setUp() throws Exception {
        modifyMapElement=new ModifyMapElement();

    }

    @After
    public void tearDown() throws Exception {
        modifyMapElement=null;
    }

    @Test
    public void givenInputExpectedMapElementAsOutput(){
        Map<String,String> input = new HashMap<String, String>();

        input.put("val1","Java");
        input.put("val2","C++");

        System.out.println(input);

        Map<String,String> expected=new HashMap<>();
        expected.put("val2","Java");
        expected.put("val1"," ");

     System.out.println(expected);



        assertEquals(expected,modifyMapElement.modifyMapElement(input));
    }
    @Test
    public void givenInputExpectedMapElementAsOutputHashMap(){
        Map<String,String> input = new HashMap<String, String>();

        input.put("val1","Java");
        input.put("val2","C++");

        System.out.println(input);

        Map<String,String> expected=new HashMap<>();
        expected.put("val2","Java");
        expected.put("val1","Java");

        System.out.println(expected);



        assertNotEquals(expected,modifyMapElement.modifyMapElement(input));
    }



}