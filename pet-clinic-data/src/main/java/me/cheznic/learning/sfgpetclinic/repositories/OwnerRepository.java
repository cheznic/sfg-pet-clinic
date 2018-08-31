package me.cheznic.learning.sfgpetclinic.repositories;

import me.cheznic.learning.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

/**
 * Created by Charles Nicoletti on 8/30/18
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {

    public Owner findByLastName(String lastName);

    public Set<Owner> findAllBy();

    public Owner findById();

    public Owner save(Owner owner);

    public void delete(Owner owner);

    public void deleteById(Long id);
}
