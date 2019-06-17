package com.company.factory;

import com.company.operation.Addoperation;
import com.company.operation.Operation;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class ObjectOperationFactoryTest {

    @Test
    public void shouldReturnAddObj() {
        List<Double> inputnumber = new ArrayList<Double>();
        inputnumber.add(5.0);
        inputnumber.add(7.0);
        Factory operationFactory = new ObjectOperationFactory(inputnumber,"add");
        Operation operation = operationFactory.getInstance();
        assertThat(operation, instanceOf(Addoperation.class));

    }

}