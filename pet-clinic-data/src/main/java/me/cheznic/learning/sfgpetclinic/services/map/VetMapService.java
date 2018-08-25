package me.cheznic.learning.sfgpetclinic.services.map;

import me.cheznic.learning.sfgpetclinic.model.Vet;
import me.cheznic.learning.sfgpetclinic.services.VetService;
import me.cheznic.learning.sfgpetclinic.services.VetSpecialtyService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Charles Nicoletti on 8/22/18
 */
@Service
public class VetMapService extends AbstractMapService<Vet> implements VetService {

    private final VetSpecialtyService vetSpecialtyService;

    public VetMapService(VetSpecialtyService vetSpecialtyService) {
        this.vetSpecialtyService = vetSpecialtyService;
    }

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

        if (vet == null)
            return null;

        vet.getVetSpecialities().forEach(specialty -> {
            if(specialty.getId() == null)
                specialty.setId(vetSpecialtyService.save(specialty).getId());
        });
        return super.save(vet);
    }
}
