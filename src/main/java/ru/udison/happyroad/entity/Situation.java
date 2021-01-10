package ru.udison.happyroad.entity;

public class Situation {

    private int price;
    private String driverName;
    private int amountOfBusStations;
    private int capacity;
    private int boundOdPassengers;
    private String phrase;

    public Situation(int price, String driverName, int amountOfBusStations, int capacity, int boundOdPassengers, String phrase) {
        this.price = price;
        this.driverName = driverName;
        this.amountOfBusStations = amountOfBusStations;
        this.capacity = capacity;
        this.boundOdPassengers = boundOdPassengers;
        this.phrase = phrase;
    }

    public String getPhrase() {
        return phrase;
    }

    public int getPrice() {
        return price;
    }

    public String getDriverName() {
        return driverName;
    }

    public int getAmountOfBusStations() {
        return amountOfBusStations;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getBoundOdPassengers() {
        return boundOdPassengers;
    }
}
