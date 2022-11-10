package com.tecsup.petclinic.services;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tecsup.petclinic.entities.Owner;
import com.tecsup.petclinic.exception.OwnerNotFoundException;

public class OwnerServiceBusquedaTest {
	private static final Logger logger = LoggerFactory.getLogger(OwnerServiceTest.class);

	//@Autowired
   //	private OwnerService ownerService;


	@Test
	public void testFindOwnerById() {

		long ID = 1;
		String NAME = "Jaime";
		Owner owner = null;
		
		try {
			
			owner = OwnerService.findById(ID);
			
		} catch (OwnerNotFoundException e) {
			fail(e.getMessage());
		}
		logger.info("" + owner);

		assertEquals(NAME, owner.getFirstname());

	}

	private void fail(String message) {
		// TODO Auto-generated method stub
		
	}

	private void assertEquals(String nAME, String firstname) {
		// TODO Auto-generated method stub
		
	}
}
