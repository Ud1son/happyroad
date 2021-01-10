package ru.udison.happyroad.serivce;

import ru.udison.happyroad.entity.Bus;
import ru.udison.happyroad.entity.BusStation;
import ru.udison.happyroad.entity.Driver;
import ru.udison.happyroad.entity.Passenger;
import ru.udison.happyroad.entity.Route;
import ru.udison.happyroad.entity.Situation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SituationImplementation {

    private Situation situation;

    public int start(Situation situation) {
        this.situation = situation;
        Route route = initialiseBusStationsWithPassengers();
        Bus bus = initialiseBusAndDriver(situation, route);
        bus.start();
        bus.getDriver().saySummaryCash();
        return bus.getDriver().getCash();
    }

    private Bus initialiseBusAndDriver(Situation situation, Route route) {
        Driver driver = new Driver(situation.getDriverName(), situation.getPhrase());
        Bus bus = new Bus();
        bus.setCapacity(situation.getCapacity());
        bus.setPrice(situation.getPrice());
        bus.setDriver(driver);
        bus.setRoute(route);
        return bus;
    }

    private Route initialiseBusStationsWithPassengers() {
        List<BusStation> busStations = createBusStations();
        Route route = new Route(busStations);
        for (BusStation busStation : busStations) {
            List<Passenger> passengers = createPassengers();
            initializeTargetBusStation(route, busStation, passengers);
            busStation.setPassengers(passengers);
        }

        return route;
    }

    private void initializeTargetBusStation(Route route, BusStation busStation, List<Passenger> passengers) {
        for (Passenger passenger : passengers) {
            passenger.setPointA(busStation.getOrderNumber());
            passenger.targetBusStation(route);
        }
    }

    public List<Passenger> createPassengers() {
        ArrayList<Passenger> passengers = new ArrayList<>();
        Random random = new Random();
        int bound = random.nextInt(situation.getBoundOdPassengers() + 1);
        for (int i = 0; i < bound; i++) {
            passengers.add(new Passenger());
        }
        return passengers;
    }

    public List<BusStation> createBusStations() {
        ArrayList<BusStation> busStations = new ArrayList<>();
        for (int i = 0; i < situation.getAmountOfBusStations(); i++) {
            busStations.add(new BusStation(i));
        }
        return busStations;
    }

}
