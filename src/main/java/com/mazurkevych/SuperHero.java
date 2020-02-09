package com.mazurkevych;

import java.util.Collection;

public class SuperHero implements Hero {
    private Power power;
    Collection<Feat> quests;

    public SuperHero(Power power) {
        this.power = power;
    }

    public void setQuests(Collection<Feat> quests) {
        this.quests = quests;
    }

    public void myPower() {
        System.out.println("My power is " + power.getNameOfPower());
    }

    public Collection<Feat> getQuests() {
        return quests;
    }
}
