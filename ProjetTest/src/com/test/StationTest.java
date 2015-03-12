package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.metier.*;

import java.util.*;

public class StationTest {

	private Station s, s2;
	private ArrayList<Borne> listeB, listeB2;
	private Borne b1, b2, b3, b4, b5;
	private TypeCharge typeC; 
	@Before
	public void setUp() throws Exception {
		typeC = new TypeCharge(1, "Normale", 3);
		b1 = new Borne(1, "01/01/01", typeC, 1);
		b2 = new Borne(2, "02/02/02", typeC, 2);
		b3 = new Borne(3, "03/03/03", typeC, 3);
		b4 = new Borne(4, "04/04/04", typeC, 3);
		b5 = new Borne(5, "05/05/05", typeC, 2);
		listeB = new ArrayList<Borne>();
		listeB2 = new ArrayList<Borne>();
		listeB.add(b1);
		listeB.add(b2);
		listeB2.add(b3);
		listeB2.add(b4);
		s = new Station(1, "Châteaulin");
		s.setLesBornes(listeB);
		s2 = new Station(2, "Nantes");
	}

	@After
	public void tearDown() throws Exception {
		s = null;
	}

	@Test
	public void testStation() {
		assertNotNull("L'instance est créée", s);
	}

	@Test
	public void testGetLibelleEmplacement() {
		assertEquals("Est-ce que le libéllé est correcte", "Châteaulin", s.getLibelleEmplacement());
	}

	@Test
	public void testSetLibelleEmplacement() {
		s.setLibelleEmplacement("Quimper");
		assertEquals("Est-ce que le libéllé est correcte", "Quimper", s.getLibelleEmplacement());
	}

	@Test
	public void testGetLesBornes() {
		assertEquals("Est-ce que la liste de borne est correcte", listeB, s.getLesBornes());
		assertEquals("Est-ce que la liste de borne est correcte", 0, s2.getLesBornes().size());
	}

	@Test
	public void testSetLesBornes() {
		s.setLesBornes(listeB2);
		assertEquals("Est-ce que la liste de borne est correcte", listeB2, s.getLesBornes());
	}

	@Test
	public void testGetIdStation() {
		assertEquals("Est-ce que l'id est correcte", 1, s.getIdStation());
	}

	@Test
	public void testGetNbBorne() {
		assertEquals("Est-ce que le nombre de borne est correcte", 2, s.getNbBorne());
	}

	@Test
	public void testAjoutBorne() {
		s.ajoutBorne(b5);
		assertEquals("Est-ce que le nombre de borne est correcte", b5, s.getLesBornes().get(2));
	}

}
