package me.cheznic.learning.sfgpetclinic.model;

import java.util.Set;

/**
 * Created by Charles Nicoletti on 8/21/18
 */
public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
