package ru.corses.geometry;

public class Point implements Cloneable {
    protected int x;
    protected int y;

    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString(){
        return String.format("{%s;%s}", x, y);
    }

    @Override
    public Point clone() {
        try {
            Point clone = (Point) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
