package ru.corses.main;

import ru.corses.geometry.Line;
import ru.corses.geometry.Point;
import ru.corses.geometry.PolyLine;

import java.util.ArrayList;


public class Start {
    public static void main(String[] args) {
        Point point = new Point(1,2);
        Point point1 = new Point(3,4);
        Point point2 = new Point(5,6);
        Point point3 = new Point(7,8);
        Line line = new Line(point,point1);
        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point2, point3);
        PolyLine polyLine = new PolyLine();
        polyLine.addPolyLine(line);
        polyLine.addPolyLine(line1);
        polyLine.addPolyLine(line2);
        PolyLine polyLine1=polyLine.clone();

        System.out.println(polyLine.equals(polyLine1));
        ArrayList<Line>lst= new ArrayList<>();
        lst.add(line2);
        lst.add(line2);
        lst.add(line2);
        polyLine1.setLines(lst);
        System.out.println(polyLine.equals(polyLine1));

    }
}

