package ru.corses.main;

import ru.corses.geometry.Line;
import ru.corses.geometry.Point;


public class Start {
    public static void main(String[] args) {
        Point point = new Point(1,2);
        Point point1 = new Point(3,4);
        Line line = new Line(point,point1);
        Line line1=line.clone();

        System.out.println(line.equals(line1));
        System.out.println(line1);
    }
}

