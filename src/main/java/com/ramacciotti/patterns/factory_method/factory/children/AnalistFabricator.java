package com.ramacciotti.patterns.factory_method.factory.children;

import com.ramacciotti.patterns.factory_method.factory.parent.CompanyFactory;
import com.ramacciotti.patterns.factory_method.products.concrete.Analist;
import com.ramacciotti.patterns.factory_method.products.interfac.Employee;

/**
 * <p>The only responsability of this class is to create an new Analist (Single responsibility principle - SOLID). </p>
 */
public class AnalistFabricator extends CompanyFactory {

    /**
     *  <p>Inherit Factory Method create() from CompanyFactory. </p>
     * @return a new Analist employee
     */
    @Override
    public Employee create() {

        System.out.println("** Creating Analist...");

        return new Analist("Mariana", "mariana.ramacciotti@gmail.com");

    }

}
