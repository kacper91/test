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
    public void testOddNumbersExterminatorNormalList () {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(4);

        //Given
        OddNumbersExterminator tester = new OddNumbersExterminator();

        //When
        System.out.println("Start testing testOddNumbersExterminatorNormalList..");

        //Then
        Assert.assertEquals(tester.exterminate(numbers),3);
    }
    @Test
    public void testOddNumbersExterminatorEmptyList () {
        ArrayList<Integer> emptyList = new ArrayList<Integer>();

        //Given
        OddNumbersExterminator tester = new OddNumbersExterminator();

        //When
        System.out.println("Start testing testOddNumbersExterminatorEmptyList..");

        //Then
        Assert.assertEquals(tester.exterminate(emptyList),0);
    }
}
