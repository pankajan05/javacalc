package com.company.factory;

import com.company.operation.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class ObjectOperationFactoryTest {
    public List<Double> getList() {
        List<Double> inputnumber = new ArrayList<Double>();
        inputnumber.add(5.0);
        inputnumber.add(7.0);

        return inputnumber;
    }


    @Test
    public void shouldReturnAddObj() {
        Factory operationFactory = new ObjectOperationFactory(this.getList(),"add");
        Operation operation = operationFactory.getInstance();
        assertThat(operation, instanceOf(Addoperation.class));
    }

    @Test
    public void shouldReturnSubObj() {
        Factory operationFactory = new ObjectOperationFactory(this.getList(),"sub");
        Operation operation = operationFactory.getInstance();
        assertThat(operation, instanceOf(SubOperation.class));
    }

    @Test
    public void shouldReturnDivObj() {
        Factory operationFactory = new ObjectOperationFactory(this.getList(),"div");
        Operation operation = operationFactory.getInstance();
        assertThat(operation, instanceOf(Divoperation.class));
    }

    @Test
    public void shouldReturnMulObj() {
        Factory operationFactory = new ObjectOperationFactory(this.getList(),"mul");
        Operation operation = operationFactory.getInstance();
        assertThat(operation, instanceOf(Muloperation.class));
    }


}