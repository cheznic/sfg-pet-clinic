package me.cheznic.learning.sfgpetclinic.bootstrap;

import me.cheznic.learning.sfgpetclinic.model.Owner;
import me.cheznic.learning.sfgpetclinic.model.Pet;
import me.cheznic.learning.sfgpetclinic.model.PetType;
import me.cheznic.learning.sfgpetclinic.model.Vet;
import me.cheznic.learning.sfgpetclinic.services.OwnerService;
import me.cheznic.learning.sfgpetclinic.services.PetService;
import me.cheznic.learning.sfgpetclinic.services.PetTypeService;
import me.cheznic.learning.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * Created by Charles Nicoletti on 8/23/18
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final PetService petService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, PetService petService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public void run(String... args) throws Exception {

        // ==================
        // Load pet type data
        PetType dogType  = new PetType();
        dogType.setName("Dog");
        dogType = petTypeService.save(dogType);

        PetType catType  = new PetType();
        catType.setName("Cat");
        catType = petTypeService.save(catType);

        PetType birdType  = new PetType();
        birdType.setName("Bird");
        birdType = petTypeService.save(birdType);

        System.out.println("Loaded pet types.");

        // ==================
        // Load owner and pet data

        Owner mike = new Owner();
        mike.setFirstName("Michael");
        mike.setLastName("Weston");
        mike.setAddress("123 Main St.");
        mike.setCity("New York");
        mike.setTelephone("555-234-5677");

        ownerService.save(mike);

        Pet chowder = new Pet();
        chowder.setPetType(dogType);
        chowder.setName("Chowder");
        chowder.setBirthDate(LocalDate.of(2011, 3, 22));
        chowder.setOwner(mike);

        petService.save(chowder);

        mike.getPets().add(chowder);

        ownerService.save(mike);


        Owner fiona = new Owner();
        fiona.setFirstName("Fiona");
        fiona.setLastName("Glenanne");
        fiona.setAddress("555 6th Ave.");
        fiona.setCity("Bremmerton");
        fiona.setTelephone("555-877-5237");

        ownerService.save(fiona);

        Pet snowBall = new Pet();
        snowBall.setPetType(catType);
        snowBall.setName("Snow Ball");
        snowBall.setBirthDate(LocalDate.of(2012, 4, 7));
        snowBall.setOwner(fiona);

        petService.save(snowBall);

        fiona.getPets().add(snowBall);

        ownerService.save(fiona);


        System.out.println("Loaded owners and owner's pets.");

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
