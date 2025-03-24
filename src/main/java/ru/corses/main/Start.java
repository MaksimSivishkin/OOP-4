package ru.corses.main;

import ru.corses.geometry.Point;


public class Start {
    public static void main(String[] args) {
        Point point = new Point(1,2);
        Point point1=point.clone();

        System.out.println(point.equals(point1));
        System.out.println(point1);
    }
}

