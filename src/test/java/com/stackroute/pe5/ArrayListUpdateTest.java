package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ArrayListUpdateTest {
    ArrayListUpdate arrayListUpdate;

    @Before
    public void setUp() throws Exception {
        arrayListUpdate=new ArrayListUpdate();
    }

    @After
    public void tearDown() throws Exception {
        arrayListUpdate=null;
    }

    @Test
    public void givenInputAsArrayList(){
        ArrayList inputArray=new ArrayList<>();

        inputArray.add("Apple");
        inputArray.add("Grape");
        inputArray.add("Melon");
        inputArray.add("Berry");
        System.out.println(inputArray);

        ArrayList expected= new ArrayList<>();

        expected.add("Kiwi");
        expected.add("Grape");
        expected.add("Mango");
        expected.add("Berry");
        System.out.println(expected);

 assertEquals(expected,arrayListUpdate.updatingTheArrayList((inputArray)));


        }

        @Test
    public void givenInputAsArrayListEpectingArrayListAsOutput(){
            ArrayList inputArray=new ArrayList<>();

            inputArray.add("Apple");
            inputArray.add("Grape");
            inputArray.add("Melon");
            inputArray.add("Berry");
            System.out.println(inputArray);

            ArrayList expected1= new ArrayList<>();

            expected1.add("Cherry");
            expected1.add("Grape");
            expected1.add("WaterMelon");
            expected1.add("Berry");
            System.out.println(expected1);

            assertNotEquals(expected1,arrayListUpdate.updatingTheArrayList((inputArray)));


        }
}