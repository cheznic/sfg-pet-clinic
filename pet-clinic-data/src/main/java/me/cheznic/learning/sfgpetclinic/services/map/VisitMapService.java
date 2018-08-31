package me.cheznic.learning.sfgpetclinic.services.map;

import me.cheznic.learning.sfgpetclinic.model.Visit;
import me.cheznic.learning.sfgpetclinic.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Charles Nicoletti on 8/30/18
 */
@Service
public class VisitMapService extends AbstractMapService<Visit> implements VisitService {

    private final VisitService visitService;

    public VisitMapService(VisitService visitService) {
        this.visitService = visitService;
    }

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Visit visit) {
        super.delete(visit);
    }

    @Override
    public Visit save(Visit visit) {

        if (visit.getPet() == null ||
                visit.getPet().getId() == null ||
                visit.getPet().getOwner() == null ||
                visit.getPet().getOwner().getId() == null)
            throw new RuntimeException("Invalid Visit");

        return super.save(visit);
    }
}