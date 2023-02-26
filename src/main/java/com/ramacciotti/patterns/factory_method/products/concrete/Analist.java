package com.ramacciotti.patterns.factory_method.products.concrete;

import com.ramacciotti.patterns.factory_method.products.interfac.Employee;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Analist implements Employee {

    private String name;

    private String email;

    @Override
    public void work() {
        System.out.println("** " + name + " is working...");
    }

    @Override
    public void eat() {
        System.out.println("** " + name + " is eating...");
    }

}
