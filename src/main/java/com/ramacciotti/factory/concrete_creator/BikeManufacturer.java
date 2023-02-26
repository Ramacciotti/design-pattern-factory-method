package com.ramacciotti.factory.concrete_creator;

import com.ramacciotti.factory.concrete_product.Bike;
import com.ramacciotti.factory.creator.TransportFactory;
import com.ramacciotti.factory.product.ITransport;

/**
 * <p>* This class is the Concrete Creator.</p>
 * <p>* It overrides the base factory method to return a specific Concrete Product (Bike).</p>
 * <p>* This is where the 'new' operator belongs.</p>
 */
public class BikeManufacturer extends TransportFactory {

    @Override
    protected ITransport createTransport() {
        return new Bike();
    }

}
