package me.cheznic.learning.sfgpetclinic.repositories;

import me.cheznic.learning.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Charles Nicoletti on 8/30/18
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
