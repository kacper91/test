package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.*;

public class CollectionTestSuite {

    @Before
    public void begin(){
        System.out.println("Test case: begin");
    }

    @After
    public void after(){
        System.out.println("Test case: end");
    }

    @Test
    public void testOddNumbersExterminatorNormalList (){
        //Given
        ArrayList <Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(4);

        OddNumbersExterminator tester = new OddNumbersExterminator();
        if(tester.exterminate(numbers)==3) {
            System.out.println("testOddNumbersExterminatorNormalList - OK");
        }else{
            System.out.println("testOddNumbersExterminatorNormalList - ERROR");

        }
    }

    @Test
    public void testOddNumbersExterminatorEmptyList (){
        ArrayList <Integer> emptyList = new ArrayList<Integer>();
        OddNumbersExterminator tester = new OddNumbersExterminator();
        if(tester.exterminate(emptyList)==0){

            System.out.println("testOddNumbersExterminatorEmptyList - OK");
        }else{
            System.out.println("testOddNumbersExterminatorEmptyList - ERROR");

        };

    }

}
