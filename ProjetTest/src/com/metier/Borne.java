package com.metier;

public class Borne {
	// déclaration des propriétés d'une borne
    private int idBorne;
    private String dateMiseEnService;
    private String etat;
    private TypeCharge typeBorne;
    private int idStation;
	
	// Constructeur sans id
    public Borne(String dateMiseEnService, TypeCharge typeBorne, int idStation) {
		super();
		this.dateMiseEnService = dateMiseEnService;
		this.etat = "ES";
		this.typeBorne = typeBorne;
		this.idStation = idStation;
	}

	// constructeur
    public Borne(int idBorne, String dateMiseEnService, TypeCharge typeBorne, int idStation) {
		super();
		this.idBorne = idBorne;
		this.dateMiseEnService = dateMiseEnService;
		this.etat = "ES";
		this.typeBorne = typeBorne;
		this.idStation = idStation;
	}
    
    // getteurs et setteurs
	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public TypeCharge getTypeBorne() {
		return typeBorne;
	}

	public void setTypeBorne(TypeCharge typeBorne) {
		this.typeBorne = typeBorne;
	}

	public int getIdBorne() {
		return idBorne;
	}

	public String getDateMiseEnService() {
		return dateMiseEnService;
	}
	
	public int getIdStation() {
		return idStation;
	}

	public void setIdStation(int idStation) {
		this.idStation = idStation;
	}

	@Override
	public String toString() {
		return "Borne [idBorne=" + idBorne + ", dateMiseEnService="
				+ dateMiseEnService + ", etat=" + etat + ", typeBorne="
				+ typeBorne + "]";
	}
	
}
