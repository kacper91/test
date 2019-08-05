package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testLogger(){

        //Given
        Logger.getInstance().log("test log 1");
        //When
        String test = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("test log 1", test);
    }
}
