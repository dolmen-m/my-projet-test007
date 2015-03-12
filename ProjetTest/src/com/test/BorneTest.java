package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.metier.*;

public class BorneTest {

	private Borne borne;
	private TypeCharge typeC;
	private TypeCharge typeC2;
	@Before
	public void setUp() throws Exception {
		typeC = new TypeCharge(1, "Normale", 3);
		borne = new Borne(1, "01/01/01", typeC, 1);
	}

	@After
	public void tearDown() throws Exception {
		borne = null;
	}

	@Test
	public void testBorne() {
		assertNotNull("L'instance est créée", borne);
	}

	@Test
	public void testGetEtat() {
		assertEquals("Est-ce que l'état est correcte", "ES", borne.getEtat());
	}

	@Test
	public void testSetEtat() {
		borne.setEtat("HS");
		assertEquals("Est-ce que l'état est correcte", "HS", borne.getEtat());
	}

	@Test
	public void testGetTypeBorne() {
		assertEquals("Est-ce que le type de borne est correcte", "Normale", borne.getTypeBorne().getLibelleTypeCharge());
	}

	@Test
	public void testSetTypeBorne() {
		typeC2 = new TypeCharge(2, "Semi-rapide", 10);
		borne.setTypeBorne(typeC2);
		assertEquals("Est-ce que le type de borne est correcte", "Semi-rapide", borne.getTypeBorne().getLibelleTypeCharge());
	}

	@Test
	public void testGetIdBorne() {
		assertEquals("Est-ce que le code est correcte", 1, borne.getIdBorne());
	}

	@Test
	public void testGetDateMiseEnService() {
		assertEquals("Est-ce que la date est correcte", "01/01/01", borne.getDateMiseEnService());
	}
	
	@Test
	public void testGetIdStation() {
		assertEquals(1, borne.getIdStation());
	}
	
	@Test
	public void testSetIdStation() {
		borne.setIdStation(2);
		assertEquals(2, borne.getIdStation());
	}
	
}
