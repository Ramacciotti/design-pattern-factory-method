package com.ramacciotti.patterns.factory_method;

import com.ramacciotti.patterns.factory_method.factory.children.AnalistFactory;
import com.ramacciotti.patterns.factory_method.factory.children.DeveloperFactory;
import com.ramacciotti.patterns.factory_method.factory.parent.CompanyFactory;

public class Application {

    public static void main(String[] args) {

        CompanyFactory developerFactory = new DeveloperFactory();
        developerFactory.create();

        System.out.println("==========================================");

        CompanyFactory analistFactory = new AnalistFactory();
        analistFactory.create();

    }

}
