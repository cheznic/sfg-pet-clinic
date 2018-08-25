package me.cheznic.learning.sfgpetclinic.bootstrap;

import me.cheznic.learning.sfgpetclinic.model.Owner;
import me.cheznic.learning.sfgpetclinic.model.PetType;
import me.cheznic.learning.sfgpetclinic.model.Vet;
import me.cheznic.learning.sfgpetclinic.services.OwnerService;
import me.cheznic.learning.sfgpetclinic.services.PetTypeService;
import me.cheznic.learning.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Charles Nicoletti on 8/23/18
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        // ==================
        // Load pet type data
        PetType dog  = new PetType();
        dog.setName("Dog");

        petTypeService.save(dog);

        PetType cat  = new PetType();
        cat.setName("Cat");

        petTypeService.save(cat);

        PetType bird  = new PetType();
        bird.setName("Bird");

        petTypeService.save(bird);

        System.out.println("Loaded pet types.");

        // ==================
        // Load owner data
        Owner o1 = new Owner();
        o1.setFirstName("Michael");
        o1.setLastName("Weston");

        ownerService.save(o1);

        Owner o2 = new Owner();
        o2.setFirstName("Fiona");
        o2.setLastName("Glenanne");

        ownerService.save(o2);

        System.out.println("Loaded owners.");

        // ==================
        // Load vet data
        Vet v1 = new Vet();
        v1.setFirstName("Sam");
        v1.setLastName("Axe");

        vetService.save(v1);

        Vet v2 = new Vet();
        v2.setFirstName("Jessie");
        v2.setLastName("Porter");

        vetService.save(v2);

        System.out.println("Loaded vets.");
    }


}
