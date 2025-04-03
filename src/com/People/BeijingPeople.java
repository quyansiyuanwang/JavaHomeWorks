package com.People;

public class BeijingPeople extends ChinaPeople {

    public void beijingOpera() {
        System.out.println("花脸、青衣、花旦和老生");
    }

    @Override
    public void speakHello() {
        System.out.println("你好，北京欢迎你！");
    }

    @Override
    public void averageHeight() {
        System.out.println("北京人的平均身高:172.5厘米。");
    }

    @Override
    public void averageWeight() {
        System.out.println("北京人的平均体重:70公斤。");
    }

}
