package com.vue;
import java.util.ArrayList;
import java.sql.*;

import com.metier.*;
import com.persistance.*;

public class ProgPrin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TEST TYPE CHARGE
		TypeChargeDAO typeC = new TypeChargeDAO();
		ArrayList<TypeCharge> listeTC = typeC.retrieve();
		System.out.println(listeTC);
		
		TypeCharge tc = typeC.find(1);
		System.out.println(tc);
		// -----------------------------------------------
		
		// TEST BORNE
		BorneDAO borne = new BorneDAO();
		ArrayList<Borne> listeB = new ArrayList<Borne>();
		listeB = borne.retrieve();
		System.out.println("\n\n");
		System.out.println(listeB);

		ArrayList<Borne> listeB2 = new ArrayList<Borne>();
		listeB2 = borne.retrieve(1);
		System.out.println(listeB2);
		
		Borne bTest = borne.find(2);
		System.out.println(bTest);
		// -----------------------------------------------
		
		// TEST STATION
		StationDAO station = new StationDAO();
		ArrayList<Station> listeS = station.retrieve();
		System.out.println("\n\n");
		System.out.println(listeS);
		
		Station sTest = station.find(1);
		System.out.println(sTest);
		// -----------------------------------------------
		
		
		// TEST AccesData
		AccesData AD = new AccesData();
		
		ArrayList<TypeCharge> tc2 = AD.getListeTypeCharge();
		System.out.println("\n\n" + tc2 + "\n");
		
		ArrayList<Borne> b2 = AD.getListeBorne();
		System.out.println(b2 + "\n");
		
		ArrayList<Borne> b3 = AD.getListeBorneStation(1);
		System.out.println(b3 + "\n");
		
		ArrayList<Station> listeS2 = AD.getListeStation();
		System.out.println(listeS2 + "\n");
		
		TypeCharge t = AD.getTypeCharge(1);
		System.out.println(t + "\n");
		
		Borne b4 = AD.getBorne(2);
		System.out.println(b4 + "\n");
		
		Station s2 = AD.getStation(1);
		System.out.println(s2 + "\n");
		
	}

}