package me.cheznic.learning.sfgpetclinic.model;

/**
 * Created by Charles Nicoletti on 8/21/18
 */
public class PetType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
