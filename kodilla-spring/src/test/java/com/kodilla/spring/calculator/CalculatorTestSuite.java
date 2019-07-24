package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest

public class CalculatorTestSuite {

    @Test
    public void testCalculations(){

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double resultAdd = calculator.add(3.0, 5.0);
        double resultSub = calculator.sub(8.0, 2.5);
        double resultMul = calculator.mul(8.0, 2.0);
        double resultDiv = calculator.div(8.0, 2.0);


        //Then
        Assert.assertEquals(resultAdd, 8.0,0);
        Assert.assertEquals(resultSub, 5.5,0);
        Assert.assertEquals(resultMul, 16.0,0);
        Assert.assertEquals(resultDiv, 4.0,0);



    }
}
