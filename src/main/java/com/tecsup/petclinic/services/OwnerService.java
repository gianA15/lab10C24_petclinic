package com.tecsup.petclinic.services;

import java.util.List;

import com.tecsup.petclinic.entities.Owner;
import com.tecsup.petclinic.exception.OwnerNotFoundException;

public interface OwnerService {

	Owner create(Owner owner);

    Owner update(Owner owner);

    void delete(Long id) throws OwnerNotFoundException;

    static Owner findById(long id) throws OwnerNotFoundException {
        // TODO Auto-generated method stub
        return null;
    }

    List<Owner> findByName(String name);


    List<Owner> findByTypeId(int typeId);

    List<Owner> findByOwnerId(int ownerId);

    Iterable<Owner> findAll();

}
