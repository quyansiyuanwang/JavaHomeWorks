package com.People;

import Bases.Person.PeopleBase;

public class ChinaPeople extends PeopleBase {

    public void chinaGongfu() {
        System.out.println("坐如钟,站如松,睡如弓");
    }

    @Override
    public void speakHello() {
        System.out.println("你好！");
    }

    @Override
    public void averageHeight() {
        System.out.println("中国人的平均身高是170厘米。");
    }

    @Override
    public void averageWeight() {
        System.out.println("中国人的平均体重是65公斤。");
    }
}
