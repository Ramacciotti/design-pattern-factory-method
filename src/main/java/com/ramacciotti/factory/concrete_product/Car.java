package com.ramacciotti.factory.concrete_product;

import com.ramacciotti.factory.product.ITransport;
import lombok.Data;

import java.time.LocalDate;

/**
 * <p>* This is a Concrete Product.</p>
 * <p>* It´s one of the different implementations of ITransport (product).</p>
 */
@Data
public class Car implements ITransport {

    private String owner;

    private String license;

    private LocalDate registrationDate;

    @Override
    public void getCargo() {
        System.out.println("** Getting passenger...");
    }

    @Override
    public void startRide() {
        System.out.println("** Starting car ride...");
    }

    @Override
    public void endRide() {
        System.out.println("** Ending car ride.");
    }

}
