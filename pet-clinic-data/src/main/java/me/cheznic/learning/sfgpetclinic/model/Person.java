package me.cheznic.learning.sfgpetclinic.model;

/**
 * Created by Charles Nicoletti on 8/21/18
 */
public class Person extends BaseEntity {

    private String firstName, lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
