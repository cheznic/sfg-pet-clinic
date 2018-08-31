package me.cheznic.learning.sfgpetclinic.repositories;

import me.cheznic.learning.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Charles Nicoletti on 8/30/18
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
