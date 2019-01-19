package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        //Given
        //When
        Logger.getInstance().log("log0");
        Logger.getInstance().log("log1");
        //Then
        Assert.assertEquals("log1", Logger.getInstance().getLastLog());
    }
}