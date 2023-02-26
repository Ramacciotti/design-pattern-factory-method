package com.ramacciotti.factory;

import com.ramacciotti.factory.concrete_creator.BikeManufacturer;
import com.ramacciotti.factory.concrete_creator.CarManufacturer;
import com.ramacciotti.factory.creator.TransportFactory;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {

    private static TransportFactory transportFactory;

    public static void main(String[] args) {

        int service = getUserInput();

        selectService(service);

        transportFactory.initFactory();

    }

    private static int getUserInput() {

        System.out.println(" ");
        System.out.println("Uber App -------------------------------------------------------------------------------");
        System.out.println(" ");

        System.out.println("Welcome to our app!");
        System.out.println(" ");

        Scanner scanner = new Scanner(System.in);

        List<String> services = Arrays.asList("Uber", "Uber Eats");
        for (int i = 0; i < services.size(); i++) {
            System.out.println(i + ". " + services.get(i));
        }

        System.out.println(" ");
        System.out.print("Type the number of the service would´d like: ");
        return scanner.nextInt();

    }

    private static void selectService(int service) {

        switch (service) {
            case 0 -> transportFactory = new CarManufacturer();
            case 1 -> transportFactory = new BikeManufacturer();
            default -> throw new IllegalArgumentException("service_number_not_available");
        }

    }

}
