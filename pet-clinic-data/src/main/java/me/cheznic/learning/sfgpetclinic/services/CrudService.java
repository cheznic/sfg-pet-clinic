package me.cheznic.learning.sfgpetclinic.services;

import me.cheznic.learning.sfgpetclinic.model.BaseEntity;

import java.util.Set;

/**
 * Created by Charles Nicoletti on 8/22/18
 */
public interface CrudService<T extends BaseEntity> {

    public Set<T> findAll();

    public T findById(Long id);

    public T save(T object);

    public void delete(T object);

    public void deleteById(Long id);
}
