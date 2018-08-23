package me.cheznic.learning.sfgpetclinic.services;

import me.cheznic.learning.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
