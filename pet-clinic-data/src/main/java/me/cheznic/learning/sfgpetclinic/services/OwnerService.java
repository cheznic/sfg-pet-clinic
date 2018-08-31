package me.cheznic.learning.sfgpetclinic.services;

import me.cheznic.learning.sfgpetclinic.model.Owner;

/**
 * Created by Charles Nicoletti on 8/22/18
 */
public interface OwnerService extends CrudService<Owner>{

    public Owner findByLastName(String lastName);

}
