package me.cheznic.learning.sfgpetclinic.bootstrap;

import me.cheznic.learning.sfgpetclinic.model.Owner;
import me.cheznic.learning.sfgpetclinic.model.Vet;
import me.cheznic.learning.sfgpetclinic.services.OwnerService;
import me.cheznic.learning.sfgpetclinic.services.VetService;
import me.cheznic.learning.sfgpetclinic.services.map.OwnerMapService;
import me.cheznic.learning.sfgpetclinic.services.map.VetMapService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Charles Nicoletti on 8/23/18
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerMapService();
        vetService = new VetMapService();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner o1 = new Owner();
        o1.setId(1L);
        o1.setFirstName("Michael");
        o1.setLastName("Weston");

        ownerService.save(o1);

        Owner o2 = new Owner();
        o2.setId(2L);
        o2.setFirstName("Fiona");
        o2.setLastName("Glenanne");

        ownerService.save(o2);

        System.out.println("Loaded owners.");

        Vet v1 = new Vet();
        v1.setId(3L);
        v1.setFirstName("Sam");
        v1.setLastName("Axe");

        vetService.save(v1);

        Vet v2 = new Vet();
        v2.setId(4L);
        v2.setFirstName("Jessie");
        v2.setLastName("Porter");

        vetService.save(v2);

        System.out.println("Loaded vets.");
    }


}
