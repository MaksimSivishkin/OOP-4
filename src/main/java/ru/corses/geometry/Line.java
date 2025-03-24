package ru.corses.geometry;

import ru.corses.main.Measurable;

import java.util.Objects;

public class Line implements Cloneable, Measurable {
    protected Point x;
    protected Point y;

    public Line(Point x, Point y){
        this.x=x;
        this.y=y;
    }

    public Line(int x1, int y1, int x2, int y2){
        this.x=new Point(x1, y1);
        this.y=new Point(x2, y2);
    }
    @Override
    public double getLenghth(double x1, double y1, double x2, double y2) {
        x1=x.getX();
        y1=x.getY();
        x2=y.getX();
        y2=y.getY();
        return Math.sqrt((Math.pow(x2-x1, 2))+(Math.pow(y2-y1, 2)));
    }

    public Point getX() {
        return x;
    }

    public Point getY() {
        return y;
    }

    public void setX(Point x) {
        this.x = x;
    }

    public void setY(Point y) {
        this.y = y;
    }

    public String toString(){
        String res=String.format("%s, %s", x, y);
        return res;
    }

    @Override
    public Line clone() {
        try {
            Line clone = (Line) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(x, line.x) && Objects.equals(y, line.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
