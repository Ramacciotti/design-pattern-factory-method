package com.ramacciotti.factory.concrete_product;

import com.ramacciotti.factory.product.ITransport;
import lombok.Data;

import java.time.LocalDate;

/**
 * <p>* This is a Concrete Product.</p>
 * <p>* It´s one of the different implementations of ITransport (product).</p>
 */
@Data
public class Bike implements ITransport {

    private String owner;

    private LocalDate registrationDate;

    @Override
    public void getCargo() {
        System.out.println("** Getting package...");
    }

    @Override
    public void startRide() {
        System.out.println("** Starting bike ride...");
    }

    @Override
    public void endRide() {
        System.out.println("** Ending bike ride.");
    }

}
