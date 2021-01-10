package ru.udison.happyroad;

import ru.udison.happyroad.entity.Situation;
import ru.udison.happyroad.serivce.SituationImplementation;

public class Application {

    public static void main(String[] args) {
        Situation situation = new Situation(30, "Ashot", 50, 18, 10000, "Я бабла заработал");
        SituationImplementation situationImplementation = new SituationImplementation();
        int cum = 0;
        for (int i = 0; i < 50; i++) {
            cum += situationImplementation.start(situation);
        }
        System.out.println(cum/50);
    }
}
