package com.mazurkevych;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringBean.xml");
        HelloWorld helloWorldBean = (HelloWorld) applicationContext.getBean("helloBean");
        helloWorldBean.printHello();
        Hero superHeroBean = (Hero) applicationContext.getBean("superHero");
        superHeroBean.myPower();
        Collection<Feat> quests = superHeroBean.getQuests();
        for (Feat quest : quests) {
            System.out.println(quest.getNameOfFeat());
        }
    }
}
