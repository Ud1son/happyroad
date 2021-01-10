package ru.udison.happyroad.entity;

import java.util.Random;

public class Passenger {

    private Integer pointA;
    private int pointB;

    public Passenger() {
    }

    public int getPointA() {
        return pointA;
    }

    public void setPointA(int pointA) {
        this.pointA = pointA;
    }

    public int getPointB() {
        return pointB;
    }

    public void setPointB(int pointB) {
        if (pointB < pointA) {
            System.out.println("Иди на хуй");
            return;
        }
        this.pointB = pointB;
    }

    public void targetBusStation(Route route) {
        if (pointA == null) {
            System.out.println("Иди на хуй");
            return;
        }
        Random random = new Random();
        int temp = 0;
        while (temp == 0) {
            temp =random.nextInt(route.getBusStations().size() - pointA + 1);
        }
        this.pointB = pointA + temp;
    }
}
