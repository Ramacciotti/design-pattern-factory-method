package com.ramacciotti.factory.product;

/**
 * <p>* This class is the Product.</p>
 * <p>* It´s common to all objects produced by the TransportFactory (Creator).</p>
 */
public interface ITransport {

    void getCargo();

    void startRide();

    void endRide();

}
