package com.company.operation;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class AddoperationTest {
    @Test
    public void addPositivetoPositive(){
        Operation operation = new Addoperation(4,5);
        double result = operation.perform();
        assertThat(result,is(9.0));
    }

    @Test
    public void addPositivetoNegative() {
        Operation operation = new Addoperation(5,-9);
        double result = operation.perform();
        assertThat(result,is(-4.0));
    }

}