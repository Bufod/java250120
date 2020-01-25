package com.company;

import java.util.Scanner;

public class Main {

    public static void goForAWalk(String name) throws MyException {

        BlackList[] blackList = BlackList.values();
        for (BlackList person : blackList){
            if (name.equalsIgnoreCase(person.toString()))
                throw new MyException(person.toString());
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        try {
            goForAWalk(name);
            System.out.println("Я могу пойти с ним гулять!");
        } catch (MyException e) {
            e.printStackTrace();
        }

    }
}
