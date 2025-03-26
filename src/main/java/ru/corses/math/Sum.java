package ru.corses.math;

import java.util.ArrayList;
import static java.lang.Double.parseDouble;

public class Sum {
    ArrayList<String> sum = new ArrayList<>();

    public Sum(ArrayList<String> sum) {
        this.sum = sum;
    }
    public double sumList(ArrayList<String> sum){
        double d=0;
        double d1=0;
        for(String s:sum){
            if(s.matches("^[0-9]*$")){
                d1= parseDouble(s);
                d+=d1;
                d1=0;
            }else if(s.matches("^-[0-9]*$")){
                d1= parseDouble(s);
                d+=d1;
                d1=0;
            }
        }
        return d;
    }

    @Override
    public String toString() {
        return String.format("%s", sum);
    }
}
