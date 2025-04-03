package com.People;

import Bases.Person.PeopleBase;

public class AmericanPeople extends PeopleBase {

    public void americanBoxing() {
        System.out.println("直拳、钩拳、组合拳");
    }

    @Override
    public void speakHello() {
        System.out.println("How do you do");
    }

    @Override
    public void averageHeight() {
        System.out.println("American's average height:176cm");
    }

    @Override
    public void averageWeight() {
        System.out.println("The average weight of American people is 75 kg.");
    }

}
