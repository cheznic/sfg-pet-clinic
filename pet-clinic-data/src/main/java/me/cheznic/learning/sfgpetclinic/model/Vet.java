package me.cheznic.learning.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Charles Nicoletti on 8/21/18
 */
public class Vet extends Person {

    private Set<VetSpeciality> vetSpecialities = new HashSet<>();

    public Set<VetSpeciality> getVetSpecialities() {
        return vetSpecialities;
    }

    public void setVetSpecialities(Set<VetSpeciality> vetSpecialities) {
        this.vetSpecialities = vetSpecialities;
    }
}
