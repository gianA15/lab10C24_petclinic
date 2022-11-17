package com.tecsup.petclinic.services;

import java.util.Optional;

import com.tecsup.petclinic.entities.Owner;
import com.tecsup.petclinic.entities.Pet;
import com.tecsup.petclinic.exception.OwnerNotFoundException;
import com.tecsup.petclinic.exception.PetNotFoundException;

public class OwnerServiceImpl {
	@Override
	public Owner findById(long id) throws OwnerNotFoundException {

		Optional<Owner> owner = ownerRepository.findById(id);

		if ( !pet.isPresent())
			throw new PetNotFoundException("Record not found...!");
			
		return pet.get();
	}
}
