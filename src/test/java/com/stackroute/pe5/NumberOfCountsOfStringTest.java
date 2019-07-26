package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class NumberOfCountsOfStringTest {
    NumberOfCountsOfString numberOfCountsOfString;

    @Before
    public void setUp() throws Exception {
        numberOfCountsOfString=new NumberOfCountsOfString();
    }

    @After
    public void tearDown() throws Exception {

        numberOfCountsOfString=null;
    }


        @Test
        public void givenInputStringShouldReturnFrequency(){


            assertEquals("CountString{data={one=5, two=2, three=2}}", numberOfCountsOfString.numberOfCountsOfString("one one -one___two,,three,one @three*one?two"));
        }



        @Test
        public void givenInputStringMustCheckForNotEquality(){
            assertNotEquals(" ",numberOfCountsOfString.numberOfCountsOfString("Hello world,Welcome to programming@910"));
        }

        @Test
        public void givenInputStringShouldReturnNotNullValue(){
            assertNotNull(numberOfCountsOfString.numberOfCountsOfString("hello world"));
        }

    }
