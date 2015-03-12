package com.metier;
import java.util.*;

public class Station {
	// déclaration des propriétés d'une station
    private int idStation;
    private String libelleEmplacement;
    private ArrayList<Borne> lesBornes;
	
    // Constructeur sans id
    public Station(String libelleEmplacement, ArrayList<Borne> lesBornes) {
		super();
		this.libelleEmplacement = libelleEmplacement;
		this.lesBornes = lesBornes;
	}

	// constructeur
    public Station(int idStation, String libelleEmplacement) {
		super();
		this.idStation = idStation;
		this.libelleEmplacement = libelleEmplacement;
		this.lesBornes = new ArrayList<Borne>();
	}
    
    // getteurs et setteurs
	public String getLibelleEmplacement() {
		return libelleEmplacement;
	}

	public void setLibelleEmplacement(String libelleEmplacement) {
		this.libelleEmplacement = libelleEmplacement;
	}

	public ArrayList<Borne> getLesBornes() {
		return lesBornes;
	}

	public void setLesBornes(ArrayList<Borne> lesBornes) {
		this.lesBornes = lesBornes;
	}

	public int getIdStation() {
		return idStation;
	}
    
	// méthodes
	public int getNbBorne()
	{
		return lesBornes.size();
	}
	public void ajoutBorne(Borne b)
	{
		lesBornes.add(b);
	}

	@Override
	public String toString() {
		return "Station [idStation=" + idStation + ", libelleEmplacement="
				+ libelleEmplacement + ", lesBornes=" + lesBornes + "]";
	}

}
