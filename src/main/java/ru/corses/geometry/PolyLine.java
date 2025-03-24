package ru.corses.geometry;

import ru.corses.main.Measurable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PolyLine implements Measurable, Cloneable {
    protected ArrayList <Line> lines=new ArrayList<>();

    public void addPolyLine(Line line){
        lines.add(line);
    }

    public List listPolyLine(){  //Метод возвращает список длин линий
        ArrayList<Double> lines1=new ArrayList<>();
        for(Line line : lines){
            lines1.add(line.getLenghth(line.getX().getX(), line.getX().getY(), line.getY().getX(), line.getY().getY()));
        }
        return lines1;
    }

    public double getLenghth(){ //Метод возвращает сумму линий из списка
        double sum=0;
        for(Line line : lines){
            sum += line.getLenghth(line.getX().getX(), line.getX().getY(), line.getY().getX(), line.getY().getY());
        }
        return sum;
    }

    public ArrayList<Line> getLines() {
        return lines;
    }

    public void setLines(ArrayList<Line> lines) {
        this.lines = lines;
    }

    @Override
    public String toString() {
        return String.format("Линия %s", lines);
    }


    @Override
    public double getLenghth(double x1, double y1, double x2, double y2) {
        return 0;
    }

    @Override
    public PolyLine clone() {
        try {
            PolyLine clone = (PolyLine) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PolyLine polyLine = (PolyLine) o;
        return Objects.equals(lines, polyLine.lines);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(lines);
    }
}