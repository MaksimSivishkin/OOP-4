package ru.corses.dish;

public class Spicy {
    private String spicy;
    public static final Spicy SPICY =new Spicy("Острый");
    public static final Spicy WERY_SPICY =new Spicy("Очень острый");
    public static final Spicy NOT_SPICY = new Spicy("Не острый");


    private Spicy (String spicy){
        this.spicy=spicy;
    }

    public String getSpicy() {
        return spicy;
    }

    @Override
    public String toString() {
        return spicy;
    }
}
