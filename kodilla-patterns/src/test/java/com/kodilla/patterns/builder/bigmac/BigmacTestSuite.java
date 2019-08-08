package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacBuilder(){


        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Ziarna")
                .burgers(2)
                .sauce("BBQ")
                .ingredient("salata")
                .ingredient("bekon")
                .ingredient("jalapeno")
                .ingredient("krewetki")
                .build();

        System.out.println(bigmac.toString());

        //When&then
        Assert.assertEquals("Ziarna",bigmac.getBun());
        Assert.assertEquals(2,bigmac.getBurgers());
        Assert.assertEquals(4,bigmac.getIngredients().size());

    }
}
