package com.tecsup.petclinic.services;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.fail;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import com.tecsup.petclinic.entities.Owner;
import com.tecsup.petclinic.exception.OwnerNotFoundException;


@SpringBootTest
public class OwnerServiceBusquedaTest {
	
	private static final Logger logger = LoggerFactory.getLogger(OwnerServiceBusquedaTest.class);

	@Autowired
	private OwnerService ownerService;
	

	@Test
	public void testFindOwnerById() {

		long ID = 1;
		String first_name = "George";
		Owner owner = null;
		
		try {
			
			owner = OwnerService.findById(ID);
			
		} catch (OwnerNotFoundException e) {
			fail(e.getMessage());
		}
		logger.info("" + owner);

		assertEquals(first_name, owner.getFirstname());
		assertEquals(first_name, owner.getFirstname());


	}

	private void fail(String message) {
		// TODO Auto-generated method stub
		
	}

	private void assertEquals(String nAME, String firstname) {
		// TODO Auto-generated method stub
		
	}
}
