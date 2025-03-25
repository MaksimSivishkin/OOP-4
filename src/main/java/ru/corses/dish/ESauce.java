package ru.corses.dish;

public class ESauce {
    String name;
    ESpicy eSpicy;

    public ESauce(String name, ESpicy eSpicy) {
        this.name = name;
        this.eSpicy = eSpicy;
    }

    @Override
    public String toString() {
        return String.format("Соус %s: %s", name,eSpicy);
    }
}
