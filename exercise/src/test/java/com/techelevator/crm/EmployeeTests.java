package com.techelevator.crm;
import com.techelevator.hr.Employee;
import org.junit.After; // The @After annotation is used to execute a method after every test
import org.junit.Assert; // The Assert class has static assertion methods for validating test results
import org.junit.Before; // The @Before annotation is used to execute a method before every test
import org.junit.Test; // The @Test annotation is used to label methods that should be run as tests
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import java.util.HashMap;
import java.util.Map;


public class EmployeeTests {

    @Test
    public void getBalanceDue_returns_95_with_walking_10_other_services_40_50() {

        // Arrange
        Employee joe = new Employee("Joe","Dirt");
        Map<String,Double> servicesRendered = new HashMap<>();
        servicesRendered.put("Walking",10.00);
        servicesRendered.put("Sitting",40.00);
        servicesRendered.put("Grooming",50.00);

        // Act
        double actual = joe.getBalanceDue(servicesRendered);

        // Assert
        Assert.assertEquals(95, actual, .001);
    }

    @Test
    public void getBalanceDue_returns_0_with_no_services() {

        // Arrange
        Employee joe = new Employee("Joe","Dirt");
        Map<String,Double> servicesRendered = new HashMap<>();

        // Act
        double actual = joe.getBalanceDue(servicesRendered);

        // Assert
        Assert.assertEquals(0, actual, .001);
    }

    @Test
    public void getBalanceDue_returns_200_with_services_10_40_150() {

        // Arrange
        Employee joe = new Employee("Joe","Dirt");
        Map<String,Double> servicesRendered = new HashMap<>();
        servicesRendered.put("Grooming",10.00);
        servicesRendered.put("Sitting",40.00);
        servicesRendered.put("Petting",150.00);

        // Act
        double actual = joe.getBalanceDue(servicesRendered);

        // Assert
        Assert.assertEquals(200, actual, .001);
    }

}
