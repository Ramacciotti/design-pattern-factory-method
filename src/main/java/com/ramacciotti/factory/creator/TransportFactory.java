package com.ramacciotti.factory.creator;

import com.ramacciotti.factory.product.ITransport;

/**
 * <p>* This class is a Creator.</p>
 * <p>* it declares the factory method that returns new product objects.</p>
 * <p>* Its abstract to force all subclasses to implement their own versioons of the factory method.</p>
 */
public abstract class TransportFactory {

    /**
     * <p>- Initialize the Factory</p>
     */
    public void initFactory() {

        System.out.println(" ");
        System.out.println("Initializing Service ----------------------------------------------------------------------");
        System.out.println(" ");

        // Create a new Transport.
        ITransport iTransport = createTransport();

        iTransport.getCargo();
        iTransport.startRide();
        iTransport.endRide();

    }

    /**
     * <p>- Factory Method.</p>
     * <p>- Decides how the Transport will be created.</p>
     *
     * @Returns ITransport interface.
     */
    protected abstract ITransport createTransport();

}
