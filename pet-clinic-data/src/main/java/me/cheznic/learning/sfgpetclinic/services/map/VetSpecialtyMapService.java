package me.cheznic.learning.sfgpetclinic.services.map;

import me.cheznic.learning.sfgpetclinic.model.Speciality;
import me.cheznic.learning.sfgpetclinic.services.VetSpecialtyService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Charles Nicoletti on 8/24/18
 */
@Service
public class VetSpecialtyMapService extends AbstractMapService<Speciality> implements VetSpecialtyService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality vetSpeciality) {
        super.delete(vetSpeciality);
    }

    @Override
    public Speciality save(Speciality vetSpeciality) {
        return super.save(vetSpeciality);
    }
}
