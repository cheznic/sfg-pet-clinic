package me.cheznic.learning.sfgpetclinic.services.map;

import me.cheznic.learning.sfgpetclinic.model.VetSpeciality;
import me.cheznic.learning.sfgpetclinic.services.VetSpecialtyService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Charles Nicoletti on 8/24/18
 */
@Service
public class VetSpecialtyMapService extends AbstractMapService<VetSpeciality> implements VetSpecialtyService {
    @Override
    public Set<VetSpeciality> findAll() {
        return super.findAll();
    }

    @Override
    public VetSpeciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(VetSpeciality vetSpeciality) {
        super.delete(vetSpeciality);
    }

    @Override
    public VetSpeciality save(VetSpeciality vetSpeciality) {
        return super.save(vetSpeciality);
    }
}
