package ru.udison.happyroad.entity;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Bus {

    private int price;
    private int capacity;
    private Driver driver;
    private Route route;
    private ConcurrentLinkedDeque<Passenger> passengers = new ConcurrentLinkedDeque<>();

    public Bus() {
    }


    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void start() {
        for (BusStation busStation : route.getBusStations()) {
            for (Passenger passenger : passengers) {
                if (passenger.getPointB() == busStation.getOrderNumber()) {
                    driver.takeAMoney(price);
                    passengers.remove(passenger);
                    capacity++;
                }
            }
            for (int i = 0; i < capacity; i++) {
                Passenger passenger = busStation.getPassenger();
                if (passenger != null) {
                    passengers.add(passenger);
                    capacity--;
                }
            }
        }
    }
}
