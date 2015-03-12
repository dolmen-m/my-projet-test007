package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.metier.*;

import java.util.*;

public class ParcTest {

	private Station s1, s2;
	private ArrayList<Borne> listeB, listeB2;
	private Borne b1, b2, b3, b4;
	private TypeCharge typeC, typeC2;
	private ArrayList<Station> listeS, listeS2;
	private Parc leParcDeStations, p0;
	
	@Before
	public void setUp() throws Exception {
		// création des types de charges
		typeC = new TypeCharge(1, "Normale", 3);
		typeC2 = new TypeCharge(2, "Semi-rapide", 24);
		
		// création des bornes
		b1 = new Borne(1, "01/01/01", typeC, 2);
		b2 = new Borne(2, "02/02/02", typeC2, 3);
		b3 = new Borne(3, "03/03/03", typeC, 1);
		b4 = new Borne(4, "04/04/04", typeC2, 1);
		// création des listes de bornes
		listeB = new ArrayList<Borne>();
		listeB2 = new ArrayList<Borne>();
		// ajout des bornes aux listes de bornes
		listeB.add(b1);
		listeB.add(b2);
		listeB2.add(b3);
		listeB2.add(b4);
		
		// création des stations
		s1 = new Station(1, "Châteaulin");
		s1.setLesBornes(listeB);
		s2 = new Station(2, "Brest");
		s2.setLesBornes(listeB2);
		
		// création du parc
		listeS = new ArrayList<Station>();
		listeS2 = new ArrayList<Station>();
		listeS.add(s1);
		listeS2.add(s2);
		
		leParcDeStations = new Parc();
		leParcDeStations.ajouterStation(s1);
		p0 = new Parc();
	}

	@After
	public void tearDown() throws Exception {
		leParcDeStations = null;
	}

	@Test
	public void testParc() {
		assertNotNull("L'instance est créée", leParcDeStations);
	}

	@Test
	public void testGetLeParcStation() {
		assertEquals("Est-ce que le parc est correcte", listeS, leParcDeStations.getLeParcStation());
		assertEquals("Est-ce que le parc est correcte", 0, p0.getLeParcStation().size());
	}

	@Test
	public void testSetLeParcStation() {
		leParcDeStations.setLeParcStation(listeS2);
		assertEquals("Est-ce que le parc est correcte", listeS2, leParcDeStations.getLeParcStation());
	}

	@Test
	public void testAjouterStation() {
		leParcDeStations.ajouterStation(s2);
		assertEquals("Est-ce que l'ajout d'une station fonctionne", s2, leParcDeStations.getLeParcStation().get(1));
	}

	@Test
	public void testGetNbStation() {
		assertEquals("Est-ce que le nombre de stations est correcte", 1, leParcDeStations.getNbStation());
	}

	@Test
	public void testGetNbBorne() {
		assertEquals("Est-ce que le nombre de bornes est correcte", 2, leParcDeStations.GetNbBorne());
	}

	@Test
	public void testGetLaStation() {
		assertEquals("Est-ce que la station est correcte", s1.getLesBornes(), leParcDeStations.getLaStation(1));
		assertEquals(null, leParcDeStations.getLaStation(300));
	}

	@Test
	public void testGetStationTypeCharge() {
		assertEquals("Est-ce que le type de charge de la station est correcte", listeS, leParcDeStations.getStationTypeCharge(0));
		assertEquals(0, leParcDeStations.getStationTypeCharge(77).size());
	}

}
