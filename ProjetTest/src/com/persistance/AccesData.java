package com.persistance;

import java.util.ArrayList;
import com.metier.*;

public class AccesData {
	private TypeChargeDAO tDAO = new TypeChargeDAO();
	private BorneDAO bDAO = new BorneDAO();
	private StationDAO sDAO = new StationDAO();
	
	public ArrayList<TypeCharge> getListeTypeCharge() {
		ArrayList<TypeCharge> listeTC = new ArrayList<TypeCharge>();
		listeTC = tDAO.retrieve();
		return listeTC;
	}
	
	public ArrayList<Station> getListeStation() {
		ArrayList<Station> listeS = new ArrayList<Station>();
		listeS = sDAO.retrieve();
		return listeS;
	}
	
	public ArrayList<Borne> getListeBorne() {
		ArrayList<Borne> listeB = new ArrayList<Borne>();
		listeB = bDAO.retrieve();
		return listeB;
	}
	
	public ArrayList<Borne> getListeBorneStation(int idBorne) {
		ArrayList<Borne> listeB2 = new ArrayList<Borne>();
		listeB2 = bDAO.retrieve(idBorne);
		return listeB2;
	}
	
	public TypeCharge getTypeCharge(int idTypeC) {
		TypeCharge TC = tDAO.find(idTypeC);
		return TC;
	}
	
	public Borne getBorne(int idBorne) {
		Borne b = bDAO.find(idBorne);
		return b;
	}
	
	public Station getStation(int idStation) {
		Station s = sDAO.find(idStation);
		return s;
	}
	
	public boolean addTypeCharge(TypeCharge t) {
		boolean resultat = tDAO.create(t);
		return resultat;
	}
	
	public boolean deleteTypeCharge(TypeCharge t) {
		boolean resultat = tDAO.delete(t);
		return resultat;
	}
	
	public boolean updateTypeCharge(TypeCharge t) {
		boolean resultat = tDAO.update(t);
		return resultat;
	}
	
	public boolean addBorne(Borne b) {
		boolean resultat = bDAO.create(b);
		return resultat;
	}
	
	public boolean deleteBorne(Borne b) {
		boolean resultat = bDAO.delete(b);
		return resultat;
	}
	
	public boolean updateBorne(Borne b) {
		boolean resultat = bDAO.update(b);
		return resultat;
	}
	
	public boolean addStation(Station s) {
		boolean resultat = sDAO.create(s);
		return resultat;
	}
	
	public boolean deleteStation(Station s) {
		boolean resultat = sDAO.delete(s);
		return resultat;
	}
	
	public boolean updateStation(Station s) {
		boolean resultat = sDAO.update(s);
		return resultat;
	}
}
