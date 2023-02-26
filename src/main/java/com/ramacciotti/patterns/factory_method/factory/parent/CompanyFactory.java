package com.ramacciotti.patterns.factory_method.factory.parent;

import com.ramacciotti.patterns.factory_method.products.interfac.Employee;

public abstract class CompanyFactory {

    // Factory Method
    public abstract Employee create();

}
