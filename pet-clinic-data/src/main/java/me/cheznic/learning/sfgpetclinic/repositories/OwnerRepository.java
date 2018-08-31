package me.cheznic.learning.sfgpetclinic.repositories;

import me.cheznic.learning.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Charles Nicoletti on 8/30/18
 */
@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
