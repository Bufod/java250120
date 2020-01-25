package com.company;

public class MyException extends Exception{
    private String name;

    public MyException(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "С вами не пойдет гулять " +
                name + '}';
    }
}
