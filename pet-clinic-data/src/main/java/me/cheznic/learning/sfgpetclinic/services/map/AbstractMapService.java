package me.cheznic.learning.sfgpetclinic.services.map;

import me.cheznic.learning.sfgpetclinic.model.BaseEntity;

import java.util.*;

/**
 * Created by Charles Nicoletti on 8/22/18
 */
public abstract class AbstractMapService<T extends BaseEntity, ID extends Long > {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(Long id) {
        return map.get(id);
    }

    T save(T object) {

        if (object != null) {
            if (object.getId() == null)
                object.setId(getNextId());

            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object cannot be null");
        }

        return map.put(object.getId(), object);
    }

    void deleteById(Long id) {
        map.remove(id);
    }

    void delete(T object) {
        map.remove(object.getId());
    }

    private Long getNextId() {
        Long nextId = null;
        try {
            nextId = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException nsee) {
            nextId = 1L;
        }

        return nextId;
    }
}
