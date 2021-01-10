package ru.udison.happyroad.entity;

public class Driver {

    private String name;
    private int cash;
    private String phrase;

    public Driver(String name, String phrase) {
        this.name = name;
        this.phrase = phrase;
    }

    public String getName() {
        return name;
    }

    public void saySummaryCash() {
        System.out.println(phrase + " " + cash);
    }

    public void takeAMoney(int cash) {
        this.cash += cash;
    }
    public int getCash() {
        return cash;
    }
}
