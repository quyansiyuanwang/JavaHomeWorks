package Homeworks;

import com.People.AmericanPeople;
import com.People.BeijingPeople;
import com.People.ChinaPeople;

public class Homework_6 {

    public static void run() {
        ChinaPeople chinaPeople = new ChinaPeople();
        AmericanPeople americanPeople = new AmericanPeople();
        BeijingPeople beijingPeople = new BeijingPeople();
        chinaPeople.speakHello();
        americanPeople.speakHello();
        beijingPeople.speakHello();
        chinaPeople.averageHeight();
        americanPeople.averageHeight();
        beijingPeople.averageHeight();
        chinaPeople.averageWeight();
        americanPeople.averageWeight();
        beijingPeople.averageWeight();
        chinaPeople.chinaGongfu();
        americanPeople.americanBoxing();
        beijingPeople.beijingOpera();
        beijingPeople.chinaGongfu();
    }
}
