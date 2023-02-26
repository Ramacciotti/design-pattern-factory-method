package com.ramacciotti.factory.concrete_creator;

import com.ramacciotti.factory.concrete_product.Car;
import com.ramacciotti.factory.creator.TransportFactory;
import com.ramacciotti.factory.product.ITransport;

/**
 * <p>* This class is the Concrete Creator.</p>
 * <p>* It overrides the base factory method to return a specific Concrete Product (Car).</p>
 * <p>* This is where the 'new' operator belongs.</p>
 */
public class CarManufacturer extends TransportFactory {

    @Override
    protected ITransport createTransport() {
        return new Car();
    }

}
