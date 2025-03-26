package ru.corses.main;


import ru.corses.dish.ESauce;
import ru.corses.math.Sum;

import java.util.ArrayList;

import static ru.corses.dish.ESpicy.*;


public class Start {
    public static void main(String[] args) {
        ArrayList<String>a=new ArrayList<>();
        a.add("1");
        a.add("2");
        a.add("21");
        a.add("2saeg1");
        a.add("-21");
        a.add("0");
        Sum sum = new Sum(a);
        System.out.println(sum.sumList(a));

    }
}

