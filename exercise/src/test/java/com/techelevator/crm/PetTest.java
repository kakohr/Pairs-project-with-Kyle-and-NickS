package com.techelevator.crm;

import org.junit.After; // The @After annotation is used to execute a method after every test
import org.junit.Assert; // The Assert class has static assertion methods for validating test results
import org.junit.Before; // The @Before annotation is used to execute a method before every test
import org.junit.Test; // The @Test annotation is used to label methods that should be run as tests
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import java.util.ArrayList;
import java.util.List;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PetTest {

        @Test
        public void getVaccination_returns_delimited_list_of_vaccines() {

                // Arrange
                Pet dog = new Pet("Fido", "Dog");
                List<String> vacc = new ArrayList<>();
                vacc.add("Rabies");
                vacc.add("Covid");
                vacc.add("distemper");
                vacc.add("parvo");
                dog.setVaccinations(vacc);

                // Act
                String actual = dog.listVaccinations();

                // Assert
                Assert.assertEquals("Rabies, Covid, distemper, parvo.", actual);
        }

        @Test
        public void getVaccination_returns_blank_string_with_empty_list_of_vaccinations() {

                // Arrange
                Pet dog = new Pet("Fido", "Dog");
                List<String> vacc = new ArrayList<>();
                dog.setVaccinations(vacc);

                // Act
                String actual = dog.listVaccinations();

                // Assert
                Assert.assertEquals("", actual);

        }
        @Test
        public void getVaccination_returns_list_with_period_when_animal_has_one_vaccine() {

                // Arrange
                Pet dog = new Pet("Fido", "Dog");
                List<String> vacc = new ArrayList<>();
                vacc.add("Rabies");
                dog.setVaccinations(vacc);

                // Act
                String actual = dog.listVaccinations();

                // Assert
                Assert.assertEquals("Rabies.", actual);
        }
}