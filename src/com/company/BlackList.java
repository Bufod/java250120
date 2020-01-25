package com.company;

public enum BlackList {
    IVAN("Иван"),
    R2D2("R2D2"),
    ASD("ASD");

    private String name;
    BlackList(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
