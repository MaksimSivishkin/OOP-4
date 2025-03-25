package ru.corses.main;


import ru.corses.dish.ESauce;
import static ru.corses.dish.ESpicy.*;


public class Start {
    public static void main(String[] args) {
        ESauce sauce = new ESauce("Лазыжан", VERY_SPICY);
        ESauce sauce1 = new ESauce("Кисло-сладкий соус", SPICY);
        ESauce sauce2 = new ESauce("Кетчуп", NOT_SPICY);
        System.out.println(sauce);
        System.out.println(sauce1);
        System.out.println(sauce2);

    }
}

