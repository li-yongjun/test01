package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProject354y {

        Project354yDelegate project354yDelegate = new Project354yDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = project354yDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}