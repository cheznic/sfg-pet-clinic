package me.cheznic.learning.sfgpetclinic.services.map;

import me.cheznic.learning.sfgpetclinic.model.BaseEntity;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Charles Nicoletti on 8/22/18
 */
public abstract class AbstractMapService<T extends BaseEntity> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(Long id) {
        return map.get(id);
    }

    T save(T object) {
        return map.put(object.getId(), object);
    }

    void deleteById(Long id) {
        map.remove(id);
    }

    void delete(T object) {
        map.remove(object.getId());
    }
}
