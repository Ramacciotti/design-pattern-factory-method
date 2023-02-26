package com.ramacciotti.patterns.factory_method;

import com.ramacciotti.patterns.factory_method.factory.children.AnalistFabricator;
import com.ramacciotti.patterns.factory_method.factory.children.DeveloperFabricator;
import com.ramacciotti.patterns.factory_method.factory.parent.CompanyFactory;
import com.ramacciotti.patterns.factory_method.products.interfac.Employee;

public class Application {

    public static void main(String[] args) {

        CompanyFactory developerFactory = new DeveloperFabricator();
        Employee developer = developerFactory.create();
        developer.work();
        developer.eat();

        System.out.println("==========================================");

        CompanyFactory analistFactory = new AnalistFabricator();
        Employee analist = analistFactory.create();
        analist.work();
        analist.eat();

    }

}
