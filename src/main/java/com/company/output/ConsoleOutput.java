package com.company.output;

public class ConsoleOutput implements Outputs {
    @Override
    public void show(String text) {
        System.out.println(text);
    }
}
//factory design pattern