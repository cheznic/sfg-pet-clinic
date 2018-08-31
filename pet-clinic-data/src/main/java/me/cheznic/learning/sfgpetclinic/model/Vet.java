package me.cheznic.learning.sfgpetclinic.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Charles Nicoletti on 8/21/18
 */
@Entity
@Table(name = "vets")
public class Vet extends Person {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialties", joinColumns = @JoinColumn(name = "vet_id"), inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    private Set<Speciality> vetSpecialities = new HashSet<>();

    public Set<Speciality> getVetSpecialities() {
        return vetSpecialities;
    }

    public void setVetSpecialities(Set<Speciality> vetSpecialities) {
        this.vetSpecialities = vetSpecialities;
    }
}
