package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    //Given
    public void testGetAverage(){
        int numbers[] = new int[10];
        numbers[0]=1;
        numbers[1]=3;
        numbers[2]=4;
        numbers[3]=5;
        numbers[4]=10;
        numbers[5]=100;
        numbers[6]=20;
        numbers[7]=30;
        numbers[8]=10;
        numbers[9]=20;
        //When
        ArrayOperations.getAverage(numbers);

        double avg = ArrayOperations.getAverage(numbers);
        System.out.println("Average of 'numbers' = "+avg);
        //Then
        Assert.assertEquals(avg, 20.3, 0);
    }
}
