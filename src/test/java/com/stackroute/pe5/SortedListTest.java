package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class SortedListTest {
    SortedList sortedList;

    @Before
    public void setUp() throws Exception {
        sortedList=new SortedList();
    }

    @After
    public void tearDown() throws Exception {
        sortedList=null;
    }

    @Test
    public void givenAInputExpectingArrayListOutput(){
        Set<String> input=new HashSet<String>();
         input.add("Harry");
         input.add("Olive");
         input.add("Alice");
         input.add("Bluto");
         input.add("Eugene");

         List<String> expected = new ArrayList<String>();

         expected.add("Alice");
        expected.add("Bluto");
        expected.add("Eugene");
        expected.add("Harry");
        expected.add("Olive");

        System.out.println(expected);


         List actualvalue=sortedList.sortingTheArrayList(input);

         assertEquals(expected,actualvalue);
        System.out.println(actualvalue);


    }

    @Test
    public void givenAInputExpectingArrayListOutputAsArrayList(){
        Set<String> input=new HashSet<String>();
        input.add("Harry");
        input.add("Olive");
        input.add("Alice");
        input.add("Bluto");
        input.add("Eugene");

        List<String> expected = new ArrayList<String>();

        expected.add("Alice");
        expected.add("Eugene");
        expected.add("Bluto");
        expected.add("Harry");
        expected.add("Olive");

        System.out.println(expected);


        List actualvalue=sortedList.sortingTheArrayList(input);

        assertNotEquals(expected,actualvalue);
        System.out.println(actualvalue);


    }
}