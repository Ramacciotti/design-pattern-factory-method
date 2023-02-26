package com.ramacciotti.patterns.factory_method.factory.children;

import com.ramacciotti.patterns.factory_method.factory.parent.CompanyFactory;
import com.ramacciotti.patterns.factory_method.products.concrete.Developer;
import com.ramacciotti.patterns.factory_method.products.interfac.Employee;

// Inherit Factory Method create()
public class DeveloperFactory extends CompanyFactory {

    @Override
    public Employee create() {

        System.out.println("** Creating Developer...");

        Developer developer = new Developer("Marcelo", "marcelo435@gmail.com");
        developer.work();
        developer.eat();

        return developer;

    }

}
