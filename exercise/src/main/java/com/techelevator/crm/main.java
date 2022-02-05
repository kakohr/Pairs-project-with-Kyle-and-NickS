package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        Pet pet = new Pet("Todd","bear");
        List<String> vacc = new ArrayList<>();

        vacc.add("Rabies");
        vacc.add("Covid");
        vacc.add("distemper");
        vacc.add("parvo");

        pet.setVaccinations(vacc);

        System.out.println(pet.listVaccinations());

    }


}
