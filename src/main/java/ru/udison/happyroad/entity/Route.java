package ru.udison.happyroad.entity;

import java.util.List;

public class Route {

    private List<BusStation> busStations;

    public Route(List<BusStation> busStations) {
        this.busStations = busStations;
    }

    public List<BusStation> getBusStations() {
        return busStations;
    }

    public void setBusStations(List<BusStation> busStations) {
        this.busStations = busStations;
    }
}
