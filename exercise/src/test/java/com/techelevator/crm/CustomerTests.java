package com.techelevator.crm;
import org.junit.After; // The @After annotation is used to execute a method after every test
import org.junit.Assert; // The Assert class has static assertion methods for validating test results
import org.junit.Before; // The @Before annotation is used to execute a method before every test
import org.junit.Test; // The @Test annotation is used to label methods that should be run as tests
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CustomerTests {

    @Test
    public void getBalanceDue_returns_100_with_services_costing_10_40_50() {

        // Arrange
        Customer joe = new Customer("Joe","Dirt");
        Map<String,Double> servicesRendered = new HashMap<>();
        servicesRendered.put("Walking",10.00);
        servicesRendered.put("Sitting",40.00);
        servicesRendered.put("Grooming",50.00);

        // Act
        double actual = joe.getBalanceDue(servicesRendered);

        // Assert
        Assert.assertEquals(100, actual, .001);
    }

    @Test
    public void getBalanceDue_returns_0_with_no_services() {

        // Arrange
        Customer joe = new Customer("Joe","Dirt");
        Map<String,Double> servicesRendered = new HashMap<>();


        // Act
        double actual = joe.getBalanceDue(servicesRendered);

        // Assert
        Assert.assertEquals(0, actual, .001);
    }

    @Test
    public void getBalanceDue_returns_50_with_service_50() {

        // Arrange
        Customer joe = new Customer("Joe","Dirt");
        Map<String,Double> servicesRendered = new HashMap<>();
        servicesRendered.put("Grooming",50.00);


        // Act
        double actual = joe.getBalanceDue(servicesRendered);

        // Assert
        Assert.assertEquals(50, actual, .001);
    }

}
