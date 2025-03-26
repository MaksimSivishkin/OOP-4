package ru.corses.math;

import java.util.ArrayList;

public class Sum {
    ArrayList<String> sum = new ArrayList<>();

    public Sum(ArrayList<String> sum) {
        this.sum = sum;
    }
    public double sumList(ArrayList<String> sum){
        double d=0;
        double d1=0;
        for(String s:sum){
            try{
                d1=Double.parseDouble(s);
                d+=d1;
                d1=0;
            }catch (NumberFormatException exception){
                d+=0;
            }
        }
        return d;
    }

    @Override
    public String toString() {
        return String.format("%s", sum);
    }
}
