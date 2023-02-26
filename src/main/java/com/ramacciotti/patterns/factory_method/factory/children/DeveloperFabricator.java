package com.ramacciotti.patterns.factory_method.factory.children;

import com.ramacciotti.patterns.factory_method.factory.parent.CompanyFactory;
import com.ramacciotti.patterns.factory_method.products.concrete.Developer;
import com.ramacciotti.patterns.factory_method.products.interfac.Employee;

/**
 * <p>The only responsability of this class is to create an new Developer (Single responsibility principle - SOLID). </p>
 */
public class DeveloperFabricator extends CompanyFactory {

    /**
     *  <p>Inherit Factory Method create() from CompanyFactory. </p>
     * @return a new Developer employee
     */
    @Override
    public Employee create() {

        System.out.println("** Creating Developer...");

        return new Developer("Marcelo", "marcelo435@gmail.com");

    }

}
