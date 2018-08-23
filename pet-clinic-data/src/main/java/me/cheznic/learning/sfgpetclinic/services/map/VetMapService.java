package me.cheznic.learning.sfgpetclinic.services.map;

import me.cheznic.learning.sfgpetclinic.model.Vet;
import me.cheznic.learning.sfgpetclinic.services.VetService;

import java.util.Set;

/**
 * Created by Charles Nicoletti on 8/22/18
 */
public class VetMapService extends AbstractMapService<Vet> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet);
    }
}
