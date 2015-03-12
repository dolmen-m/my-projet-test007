package com.test;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.metier.TypeCharge;

public class TypeChargeTest {

	private TypeCharge typeCharge;
	@Before
	public void setUp() throws Exception {
		typeCharge = new TypeCharge(1, "Normale", 3);
	}

	@After
	public void tearDown() throws Exception {
		typeCharge = null;
	}

	@Test
	public void testTypeCharge() {
		assertNotNull("L'instance est créée", typeCharge);
	}

	@Test
	public void testGetLibelleTypeCharge() {
		assertEquals("Est-ce que le nom est correcte", "Normale", typeCharge.getLibelleTypeCharge());
	}

	@Test
	public void testSetLibelleTypeCharge() {
		typeCharge.setLibelleTypeCharge("Semi-rapide");
		assertEquals("Est-ce que le nom est correcte", "Semi-rapide", typeCharge.getLibelleTypeCharge());
	}

	@Test
	public void testGetPuissanceTypeCharge() {
		assertEquals("Est-ce que la puissance est correcte", 3, typeCharge.getPuissanceTypeCharge());
	}

	@Test
	public void testSetPuissanceTypeCharge() {
		typeCharge.setPuissanceTypeCharge(10);
		assertEquals("Est-ce que la puissance est correcte", 10, typeCharge.getPuissanceTypeCharge());
	}

	@Test
	public void testGetCodeTypeCharge() {
		assertEquals("Est-ce que le code est correcte", 1, typeCharge.getCodeTypeCharge());
	}

}
