package me.cheznic.learning.sfgpetclinic.model;

import java.io.Serializable;

/**
 * Created by Charles Nicoletti on 8/22/18
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
