package me.cheznic.learning.sfgpetclinic.repositories;

import me.cheznic.learning.sfgpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Charles Nicoletti on 8/30/18
 */
public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
