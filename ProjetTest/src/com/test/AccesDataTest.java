package com.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.persistance.*;
import com.metier.*;

public class AccesDataTest {

	private AccesData AD;
	
	@Before
	public void setUp() throws Exception {
		AD = new AccesData();
	}

	@After
	public void tearDown() throws Exception {
		AD = null;
	}

	@Test
	public void testGetListeTypeCharge() {
		assertEquals(3, AD.getListeTypeCharge().size());
	}

	@Test
	public void testGetListeStation() {
		assertEquals(3, AD.getListeStation().size());
	}

	@Test
	public void testGetListeBorne() {
		assertEquals(6, AD.getListeBorne().size());
	}

	@Test
	public void testGetListeBorneStation() {
		assertEquals(3, AD.getListeBorneStation(1).size());
	}

	@Test
	public void testGetTypeCharge() {
		assertEquals(1, AD.getTypeCharge(1).getCodeTypeCharge());
	}

	@Test
	public void testGetBorne() {
		assertEquals(3, AD.getBorne(3).getIdBorne());
	}

	@Test
	public void testGetStation() {
		assertEquals(2, AD.getStation(2).getIdStation());
	}
	
	@Test
	public void testAddDeleteTypeCharge() {
		TypeCharge type = new TypeCharge("Très Rapide", 4);
		boolean test = true;
		assertEquals(test, AD.addTypeCharge(type));
		
		ArrayList<TypeCharge> listeTypeCharge = AD.getListeTypeCharge();
		//TypeCharge type2 = new TypeCharge(4, "Très Rapide", 4);
		boolean test2 = true;
		assertEquals(test2, AD.deleteTypeCharge(listeTypeCharge.get(listeTypeCharge.size()-1)));
	}
	
	@Test
	public void testDeleteTypeCharge() {
		/*TypeCharge type = new TypeCharge(4, "Très Rapide", 4);
		boolean test = true;
		assertEquals(test, AD.deleteTypeCharge(type));*/
	}
	
	@Test
	public void testUpdateTypeCharge() {
		TypeCharge type = new TypeCharge(1, "Très Lent", 1);
		boolean test = true;
		assertEquals(test, AD.updateTypeCharge(type));
	}
	
	@Test
	public void testAddBorne() {
		TypeCharge type = new TypeCharge(2, "Normale", 24);
		Borne b = new Borne("01/02/03", type, 1);
		boolean test = true;
		assertEquals(test, AD.addBorne(b));
		
		TypeCharge type2 = new TypeCharge(5, "Très Rapide", 4);
		Borne b2 = new Borne(7, "01/02/03", type2, 1);
		boolean test2 = true;
		assertEquals(test2, AD.deleteBorne(b2));
	}
	
	@Test
	public void testDeleteBorne() {
		/*TypeCharge type = new TypeCharge(5, "Très Rapide", 4);
		Borne b = new Borne(7, "01/02/03", type, 1);
		boolean test = true;
		assertEquals(test, AD.deleteBorne(b));*/
	}
	
	@Test
	public void testUpdateBorne() {
		TypeCharge type = new TypeCharge(5, "Très Rapide", 4);
		Borne b = new Borne(4, "10/10/10", type, 1);
		boolean test = true;
		assertEquals(test, AD.updateBorne(b));
	}
}
