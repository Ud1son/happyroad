package ru.udison.happyroad.entity;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class BusStation {

    private int orderNumber;
    private Queue<Passenger> passengers;

    public BusStation(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Queue<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = new ArrayDeque<Passenger>(passengers);
    }

    public Passenger getPassenger() {
        return passengers.poll();
    }
}
