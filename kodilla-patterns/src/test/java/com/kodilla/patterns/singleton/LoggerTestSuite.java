package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

        private static Logger logger;

    @BeforeClass
    public static void saveLog(){
      Logger.getInstance().log("test log 1");
    }

    @Test
    public void testLogger(){

        //Given

        //When
        String test = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("test log 1", test);
    }
}
