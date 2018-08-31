package me.cheznic.learning.sfgpetclinic.repositories;

import me.cheznic.learning.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Charles Nicoletti on 8/30/18
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
