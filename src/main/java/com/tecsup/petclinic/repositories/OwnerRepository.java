

package com.tecsup.petclinic.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tecsup.petclinic.entities.Owner;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long> {

    List<Owner> findByName(String name);

    List<Owner> findByTypeId(int typeId);

    List<Owner> findByOwnerId(int ownerId);

}