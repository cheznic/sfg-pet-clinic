package me.cheznic.learning.sfgpetclinic.services.map;

import me.cheznic.learning.sfgpetclinic.model.Owner;
import me.cheznic.learning.sfgpetclinic.services.OwnerService;

import java.util.Set;

/**
 * Created by Charles Nicoletti on 8/22/18
 */
public class OwnerMapService extends AbstractMapService<Owner> implements OwnerService {

    @Override
    public Owner findByLastName(String lastName) {
        return super.findAll().stream().filter(x -> lastName.equals(x.getLastName())).findAny().orElse(null);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
