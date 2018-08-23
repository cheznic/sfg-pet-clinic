package me.cheznic.learning.sfgpetclinic.services;

import java.util.Set;

/**
 * Created by Charles Nicoletti on 8/22/18
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id)
}
