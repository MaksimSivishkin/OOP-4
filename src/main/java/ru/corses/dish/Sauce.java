package ru.corses.dish;

public class Sauce {
    String name;
    Spicy spicy;

    public Sauce(String name, Spicy spicy) {
        this.name = name;
        this.spicy = spicy;
    }

    @Override
    public String toString() {
        return String.format("Соус %s: %s", name, spicy.toString());
    }
}
