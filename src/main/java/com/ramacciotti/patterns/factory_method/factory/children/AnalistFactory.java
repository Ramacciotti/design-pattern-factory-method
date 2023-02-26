package com.ramacciotti.patterns.factory_method.factory.children;

import com.ramacciotti.patterns.factory_method.factory.parent.CompanyFactory;
import com.ramacciotti.patterns.factory_method.products.concrete.Analist;
import com.ramacciotti.patterns.factory_method.products.interfac.Employee;

// Inherit Factory Method create()
public class AnalistFactory extends CompanyFactory {

    @Override
    public Employee create() {

        System.out.println("** Creating Analist...");

        Analist analist = new Analist("Mariana", "mariana.ramacciotti@gmail.com");
        analist.work();
        analist.eat();

        return analist;

    }

}
