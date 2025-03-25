package ru.corses.main;


import ru.corses.dish.ESauce;
import ru.corses.dish.ESpicy;
import ru.corses.dish.Sauce;
import ru.corses.dish.Spicy;

public class Start {
    public static void main(String[] args) {
        Sauce sauce = new Sauce("Лазыжан", Spicy.WERY_SPICY);
        Sauce sauce1 = new Sauce("Кисло-сладкий соус", Spicy.SPICY);
        Sauce sauce2 = new Sauce("Кетчуп", Spicy.NOT_SPICY);
        System.out.println(sauce);
        System.out.println(sauce1);
        System.out.println(sauce2);
        ESauce eSauce = new ESauce("Тобаско", ESpicy.ОСТРЫЙ);
        System.out.println(eSauce);
    }
}

